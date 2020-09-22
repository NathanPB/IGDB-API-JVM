package com.api.igdb.request

import com.api.igdb.apicalypse.ApiCalypse
import com.api.igdb.exceptions.RequestException
import com.api.igdb.utils.PublicEndpoint
import proto.*
import proto.Collection


@Throws(RequestException::class)
fun IGDBWrapper.ageRatings(apiCalypse: ApiCalypse): List<AgeRating> {
    val bytes = apiProtoRequest(PublicEndpoint.AGE_RATINGS, apiCalypse.buildQuery())
    return AgeRatingResult.parseFrom(bytes).ageratingsList
}

@Throws(RequestException::class)
fun IGDBWrapper.ageRatingContentDescriptions(apiCalypse: ApiCalypse): List<AgeRatingContentDescription> {
    val bytes = apiProtoRequest(PublicEndpoint.AGE_RATING_CONTENT_DESCRIPTIONS, apiCalypse.buildQuery())
    return AgeRatingContentDescriptionResult.parseFrom(bytes).ageratingcontentdescriptionsList
}

@Throws(RequestException::class)
fun IGDBWrapper.alternativeNames(apiCalypse: ApiCalypse): List<AlternativeName> {
    val bytes = apiProtoRequest(PublicEndpoint.ALTERNATIVE_NAMES, apiCalypse.buildQuery())
    return AlternativeNameResult.parseFrom(bytes).alternativenamesList
}

@Throws(RequestException::class)
fun IGDBWrapper.artworks(apiCalypse: ApiCalypse): List<Artwork> {
    val bytes = apiProtoRequest(PublicEndpoint.ARTWORKS, apiCalypse.buildQuery())
    return ArtworkResult.parseFrom(bytes).artworksList
}

@Throws(RequestException::class)
fun IGDBWrapper.characters(apiCalypse: ApiCalypse): List<Character> {
    val bytes = apiProtoRequest(PublicEndpoint.CHARACTERS, apiCalypse.buildQuery())
    return CharacterResult.parseFrom(bytes).charactersList
}

@Throws(RequestException::class)
fun IGDBWrapper.collections(apiCalypse: ApiCalypse): List<Collection> {
    val bytes = apiProtoRequest(PublicEndpoint.COLLECTIONS, apiCalypse.buildQuery())
    return CollectionResult.parseFrom(bytes).collectionsList
}

@Throws(RequestException::class)
fun IGDBWrapper.characterMugShots(apiCalypse: ApiCalypse): List<CharacterMugShot> {
    val bytes = apiProtoRequest(PublicEndpoint.CHARACTER_MUG_SHOTS, apiCalypse.buildQuery())
    return CharacterMugShotResult.parseFrom(bytes).charactermugshotsList
}

@Throws(RequestException::class)
fun IGDBWrapper.companies(apiCalypse: ApiCalypse): List<Company> {
    val bytes = apiProtoRequest(PublicEndpoint.COMPANIES, apiCalypse.buildQuery())
    return CompanyResult.parseFrom(bytes).companiesList
}

@Throws(RequestException::class)
fun IGDBWrapper.companyWebsites(apiCalypse: ApiCalypse): List<CompanyWebsite> {
    val bytes = apiProtoRequest(PublicEndpoint.COMPANY_WEBSITES, apiCalypse.buildQuery())
    return CompanyWebsiteResult.parseFrom(bytes).companywebsitesList
}

@Throws(RequestException::class)
fun IGDBWrapper.companyLogos(apiCalypse: ApiCalypse): List<CompanyLogo> {
    val bytes = apiProtoRequest(PublicEndpoint.COMPANY_LOGOS, apiCalypse.buildQuery())
    return CompanyLogoResult.parseFrom(bytes).companylogosList
}

@Throws(RequestException::class)
fun IGDBWrapper.covers(apiCalypse: ApiCalypse): List<Cover> {
    val bytes = apiProtoRequest(PublicEndpoint.COVERS, apiCalypse.buildQuery())
    return CoverResult.parseFrom(bytes).coversList
}

@Throws(RequestException::class)
fun IGDBWrapper.externalGames(apiCalypse: ApiCalypse): List<ExternalGame> {
    val bytes = apiProtoRequest(PublicEndpoint.EXTERNAL_GAMES, apiCalypse.buildQuery())
    return ExternalGameResult.parseFrom(bytes).externalgamesList
}

@Throws(RequestException::class)
fun IGDBWrapper.franchises(apiCalypse: ApiCalypse): List<Franchise> {
    val bytes = apiProtoRequest(PublicEndpoint.FRANCHISES, apiCalypse.buildQuery())
    return FranchiseResult.parseFrom(bytes).franchisesList
}

@Throws(RequestException::class)
fun IGDBWrapper.games(apiCalypse: ApiCalypse): List<Game> {
    val bytes = apiProtoRequest(PublicEndpoint.GAMES, apiCalypse.buildQuery())
    return GameResult.parseFrom(bytes).gamesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameEngines(apiCalypse: ApiCalypse): List<GameEngine> {
    val bytes = apiProtoRequest(PublicEndpoint.GAME_ENGINES, apiCalypse.buildQuery())
    return GameEngineResult.parseFrom(bytes).gameenginesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameEngineLogos(apiCalypse: ApiCalypse): List<GameEngineLogo> {
    val bytes = apiProtoRequest(PublicEndpoint.GAME_ENGINE_LOGOS, apiCalypse.buildQuery())
    return GameEngineLogoResult.parseFrom(bytes).gameenginelogosList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameModes(apiCalypse: ApiCalypse): List<GameMode> {
    val bytes = apiProtoRequest(PublicEndpoint.GAME_MODES, apiCalypse.buildQuery())
    return GameModeResult.parseFrom(bytes).gamemodesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameVersion(apiCalypse: ApiCalypse): List<GameVersion> {
    val bytes = apiProtoRequest(PublicEndpoint.GAME_VERSIONS, apiCalypse.buildQuery())
    return GameVersionResult.parseFrom(bytes).gameversionsList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameVersionFeatures(apiCalypse: ApiCalypse): List<GameVersionFeature> {
    val bytes = apiProtoRequest(PublicEndpoint.GAME_VERSION_FEATURES, apiCalypse.buildQuery())
    return GameVersionFeatureResult.parseFrom(bytes).gameversionfeaturesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameVersionFeatureValues(apiCalypse: ApiCalypse): List<GameVersionFeatureValue> {
    val bytes = apiProtoRequest(PublicEndpoint.GAME_VERSION_FEATURE_VALUES, apiCalypse.buildQuery())
    return GameVersionFeatureValueResult.parseFrom(bytes).gameversionfeaturevaluesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameVideos(apiCalypse: ApiCalypse): List<GameVideo> {
    val bytes = apiProtoRequest(PublicEndpoint.GAME_VIDEOS, apiCalypse.buildQuery())
    return GameVideoResult.parseFrom(bytes).gamevideosList
}

@Throws(RequestException::class)
fun IGDBWrapper.genres(apiCalypse: ApiCalypse): List<Genre> {
    val bytes = apiProtoRequest(PublicEndpoint.GENRES, apiCalypse.buildQuery())
    return GenreResult.parseFrom(bytes).genresList
}

@Throws(RequestException::class)
fun IGDBWrapper.involvedCompanies(apiCalypse: ApiCalypse): List<InvolvedCompany> {
    val bytes = apiProtoRequest(PublicEndpoint.INVOLVED_COMPANIES, apiCalypse.buildQuery())
    return InvolvedCompanyResult.parseFrom(bytes).involvedcompaniesList
}

@Throws(RequestException::class)
fun IGDBWrapper.keywords(apiCalypse: ApiCalypse): List<Keyword> {
    val bytes = apiProtoRequest(PublicEndpoint.KEYWORDS, apiCalypse.buildQuery())
    return KeywordResult.parseFrom(bytes).keywordsList
}

@Throws(RequestException::class)
fun IGDBWrapper.multiplayerModes(apiCalypse: ApiCalypse): List<MultiplayerMode> {
    val bytes = apiProtoRequest(PublicEndpoint.MULTIPLAYER_MODES, apiCalypse.buildQuery())
    return MultiplayerModeResult.parseFrom(bytes).multiplayermodesList
}

@Throws(RequestException::class)
fun IGDBWrapper.platforms(apiCalypse: ApiCalypse): List<Platform> {
    val bytes = apiProtoRequest(PublicEndpoint.PLATFORMS, apiCalypse.buildQuery())
    return PlatformResult.parseFrom(bytes).platformsList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformLogos(apiCalypse: ApiCalypse): List<PlatformLogo> {
    val bytes = apiProtoRequest(PublicEndpoint.PLATFORM_LOGOS, apiCalypse.buildQuery())
    return PlatformLogoResult.parseFrom(bytes).platformlogosList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformVersions(apiCalypse: ApiCalypse): List<PlatformVersion> {
    val bytes = apiProtoRequest(PublicEndpoint.PLATFORM_VERSIONS, apiCalypse.buildQuery())
    return PlatformVersionResult.parseFrom(bytes).platformversionsList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformVersionCompanies(apiCalypse: ApiCalypse): List<PlatformVersionCompany> {
    val bytes = apiProtoRequest(PublicEndpoint.PLATFORM_VERSION_COMPANIES, apiCalypse.buildQuery())
    return PlatformVersionCompanyResult.parseFrom(bytes).platformversioncompaniesList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformVersionReleaseDates(apiCalypse: ApiCalypse): List<PlatformVersionReleaseDate> {
    val bytes = apiProtoRequest(PublicEndpoint.PLATFORM_VERSION_RELEASE_DATES, apiCalypse.buildQuery())
    return PlatformVersionReleaseDateResult.parseFrom(bytes).platformversionreleasedatesList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformWebsites(apiCalypse: ApiCalypse): List<PlatformWebsite> {
    val bytes = apiProtoRequest(PublicEndpoint.PLATFORM_WEBSITES, apiCalypse.buildQuery())
    return PlatformWebsiteResult.parseFrom(bytes).platformwebsitesList
}

@Throws(RequestException::class)
fun IGDBWrapper.playerPerspectives(apiCalypse: ApiCalypse): List<PlayerPerspective> {
    val bytes = apiProtoRequest(PublicEndpoint.PLAYER_PERSPECTIVES, apiCalypse.buildQuery())
    return PlayerPerspectiveResult.parseFrom(bytes).playerperspectivesList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformFamilies(apiCalypse: ApiCalypse): List<PlatformFamily> {
    val bytes = apiProtoRequest(PublicEndpoint.PLATFORM_FAMILIES, apiCalypse.buildQuery())
    return PlatformFamilyResult.parseFrom(bytes).platformfamiliesList
}

@Throws(RequestException::class)
fun IGDBWrapper.releaseDates(apiCalypse: ApiCalypse): List<ReleaseDate> {
    val bytes = apiProtoRequest(PublicEndpoint.RELEASE_DATES, apiCalypse.buildQuery())
    return ReleaseDateResult.parseFrom(bytes).releasedatesList
}

@Throws(RequestException::class)
fun IGDBWrapper.screenshots(apiCalypse: ApiCalypse): List<Screenshot> {
    val bytes = apiProtoRequest(PublicEndpoint.SCREENSHOTS, apiCalypse.buildQuery())
    return ScreenshotResult.parseFrom(bytes).screenshotsList
}

@Throws(RequestException::class)
fun IGDBWrapper.search(apiCalypse: ApiCalypse): List<Search> {
    val bytes = apiProtoRequest(PublicEndpoint.SEARCH, apiCalypse.buildQuery())
    return SearchResult.parseFrom(bytes).searchesList
}

@Throws(RequestException::class)
fun IGDBWrapper.themes(apiCalypse: ApiCalypse): List<Theme> {
    val bytes = apiProtoRequest(PublicEndpoint.THEMES, apiCalypse.buildQuery())
    return ThemeResult.parseFrom(bytes).themesList
}

@Throws(RequestException::class)
fun IGDBWrapper.websites(apiCalypse: ApiCalypse): List<Website> {
    val bytes = apiProtoRequest(PublicEndpoint.WEBSITES, apiCalypse.buildQuery())
    return WebsiteResult.parseFrom(bytes).websitesList
}
