package com.reen.multipleviewholders

class LandmarkModel {
    companion object {
        fun getLandmarks(): ArrayList<Landmark> = arrayListOf(
            Landmark("Mt. Kenya", "This is a mountain in Kenya 1", null, HasImage.FALSE),
            Landmark("Mt. Kenya", "This is a mountain in Kenya 2", null, HasImage.FALSE),
            Landmark("Mt. Kenya", "This is a mountain in Kenya 3", null, HasImage.FALSE),
            Landmark(
                "Mt. Kenya", "This is a mountain in Kenya 4", R.drawable.ic_launcher_background,
                HasImage.TRUE
            ),
            Landmark("Mt. Kenya", "This is a mountain in Kenya 5", null, HasImage.FALSE),
            Landmark(
                "Mt. Kenya", "This is a mountain in Kenya 6", R.drawable.ic_launcher_foreground,
                HasImage.TRUE
            ),
            Landmark("Mt. Kenya", "This is a mountain in Kenya 7", null, HasImage.FALSE),
            Landmark("Mt. Kenya", "This is a mountain in Kenya 8", null, HasImage.FALSE)
        )
    }
}