package com.example.thesocianetwork.Examples

enum class PostType{
    StaticImage,
    Video,
    Carousel
}

enum class Reactions{
    Like,
    Hearth,
    Laugh,
    Sad,
    Dislike
}

data class Post(
    val type: PostType,
    val reactions: ArrayList<Reactions>
)
fun main(){
    val fbPost = Post(
        type = PostType.Video,
        reactions = arrayListOf(Reactions.Like, Reactions.Hearth, Reactions.Sad)
        )
    val fbPost2 = Post(
        type = PostType.Carousel,
        reactions = arrayListOf(Reactions.Hearth, Reactions.Sad, Reactions.Dislike)
    )
    println(fbPost)
    println(fbPost2)
}