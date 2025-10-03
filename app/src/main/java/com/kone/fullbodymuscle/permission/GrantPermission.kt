package com.kone.fullbodymuscle.permission

/**
//on button click location ask
//check before button click
//if granted could all be in one function
// within composable function launch sideeffect becuase its asynchronous
// persisit location data -

@Composable
fun GetUserPermission() {
    val context = LocalContext.current
    PermissionButton() {}

    when {
        ContextCompat.checkSelfPermission(
            context,
            Manifest.permission.ACCESS_COARSE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED -> {
            //fetch location -> pass in location to function
            val fusedLocationClient: FusedLocationProviderClient =
                LocationServices.getFusedLocationProviderClient(context)

            fusedLocationClient.lastLocation
                .addOnSuccessListener { location : Location? ->

                }
        }
        else -> {
            //permissionLauncher.launch(Manifest.permission.ACCESS_COARSE_LOCATION)
        }
    }

            val permissionLauncher = rememberLauncherForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted: Boolean ->
            if (isGranted) {
                val fusedLocationClient: FusedLocationProviderClient =
                    LocationServices.getFusedLocationProviderClient(context)

                fusedLocationClient.lastLocation
                    .addOnSuccessListener { location : Location? ->

                    }
            } else {
                //function name with default value which should be cloudy

            }

        }

        permissionLauncher.launch(Manifest.permission.ACCESS_COARSE_LOCATION)

    }


@Composable
fun PermissionButton(onClick: () -> Unit) {
    Button(onClick = onClick) { }
}
        */