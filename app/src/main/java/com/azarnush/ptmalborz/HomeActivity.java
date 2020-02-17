package com.azarnush.ptmalborz;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.azarnush.ptmalborz.ui.home.HomeFragment;
import com.azarnush.ptmalborz.ui.tools.AboutـusFragment;
import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class HomeActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    DrawerLayout drawer;
    public static FragmentManager fragmentManager;
    public static Toolbar toolbar;
    public static ImageView imageShare;
    View container;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbar = findViewById(R.id.toolbar);
        fragmentManager = getSupportFragmentManager();
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        imageShare = findViewById(R.id.img_share);
        container = findViewById(R.id.nav_host_fragment);


        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_all_laws, R.id.nav_weblog, R.id.nav_slideshow,
                R.id.nav_about_us, R.id.nav_contactUs, R.id.nav_share, R.id.nav_exit)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);


        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController controller,
                                             @NonNull NavDestination destination, @Nullable Bundle arguments) {
                Fragment fragment = null;
                switch (destination.getId()) {
                    case R.id.nav_home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.nav_all_laws:
                        fragment = new All_lawsFragment();
                        break;
                    case R.id.nav_weblog:
                        fragment = new WebLogFragment();
                        break;
                    case R.id.nav_about_us:
                        fragment = new AboutـusFragment();
                        break;
                    case R.id.nav_contactUs:
                        fragment = new ContactUsFragment();
                        break;
                    case R.id.nav_exit:
                        finish();
                        break;
                    case R.id.nav_slideshow:
                        fragment = new Question_and_answerFragment();
                        break;


                }
                if (fragment != null)
                    HomeActivity.fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, fragment).commit();
            }
        });

    }


    @Override
    public void onBackPressed() {

        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);

        } else if ( toolbar.getTitle()=="صفحه اصلی") {
           // fragmentManager.getBackStackEntryCount() == 0 &

            AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
            builder.setTitle(R.string.app_name);
            builder.setIcon(R.drawable.logo);
            builder.setMessage("آیا قصد خروج از برنامه را دارید؟")
                    .setCancelable(false)
                    .setPositiveButton("", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            //Toast.makeText(getApplicationContext(), "finish", Toast.LENGTH_LONG).show();
                            finish();
                        }
                    })
                    .setNegativeButton("", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                builder.setPositiveButtonIcon(getDrawable(R.drawable.yes_icon))
                        .setNegativeButtonIcon(getDrawable(R.drawable.no_icon));

            }
            AlertDialog alert = builder.create();
            alert.show();


        } else super.onBackPressed();
    }

    @Override
    public boolean onSupportNavigateUp() {

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    protected void onResume() {
        super.onResume();
        HomeActivity.imageShare.setVisibility(View.INVISIBLE);
    }
}
