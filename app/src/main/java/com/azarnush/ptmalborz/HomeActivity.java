package com.azarnush.ptmalborz;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.azarnush.ptmalborz.ui.home.HomeFragment;
import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private AppBarConfiguration mAppBarConfiguration;
    DrawerLayout drawer;
    public static FragmentManager fragmentManager;
    public static Toolbar toolbar;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbar = findViewById(R.id.toolbar);
        fragmentManager = getSupportFragmentManager();
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_all_laws, R.id.nav_weblog, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_contactUs, R.id.nav_share, R.id.nav_send)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

    }

    @Override
    public void onBackPressed() {

        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (fragmentManager.getBackStackEntryCount() == 0) {


            AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
            builder.setTitle(R.string.app_name);
            builder.setIcon(R.drawable.logo);
            builder.setMessage("آیا قصد خروج از برنامه را دارید؟")
                    .setCancelable(false)
                    .setPositiveButton("بله", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText(getApplicationContext(), "finish", Toast.LENGTH_LONG).show();
                            finish();
                        }
                    })
                    .setNegativeButton("خیر", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
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
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.nav_home:
                fragment = new HomeFragment();
                break;

            case R.id.nav_all_laws:

                fragment = new All_lawsFragment();
                break;
            case R.id.nav_weblog:
                fragment = new WebLogFragment();
                break;

        }

        fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, fragment).commit();

        return true;
    }
}
