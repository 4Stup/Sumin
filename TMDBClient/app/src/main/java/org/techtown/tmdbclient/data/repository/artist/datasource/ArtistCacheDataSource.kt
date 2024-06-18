package org.techtown.tmdbclient.data.repository.artist.datasource

import org.techtown.tmdbclient.data.model.artist.Artist

interface ArtistCacheDataSource {
  suspend fun getArtistsFromCache():List<Artist>
  suspend fun saveArtistsToCache(artists:List<Artist>)
}