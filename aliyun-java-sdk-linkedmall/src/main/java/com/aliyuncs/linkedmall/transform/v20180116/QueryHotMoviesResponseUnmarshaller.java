/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.QueryHotMoviesResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryHotMoviesResponse.Movie;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryHotMoviesResponseUnmarshaller {

	public static QueryHotMoviesResponse unmarshall(QueryHotMoviesResponse queryHotMoviesResponse, UnmarshallerContext _ctx) {
		
		queryHotMoviesResponse.setRequestId(_ctx.stringValue("QueryHotMoviesResponse.RequestId"));
		queryHotMoviesResponse.setLogsId(_ctx.stringValue("QueryHotMoviesResponse.LogsId"));
		queryHotMoviesResponse.setSubCode(_ctx.stringValue("QueryHotMoviesResponse.SubCode"));
		queryHotMoviesResponse.setSubMessage(_ctx.stringValue("QueryHotMoviesResponse.SubMessage"));
		queryHotMoviesResponse.setCode(_ctx.stringValue("QueryHotMoviesResponse.Code"));
		queryHotMoviesResponse.setSuccess(_ctx.booleanValue("QueryHotMoviesResponse.Success"));
		queryHotMoviesResponse.setMessage(_ctx.stringValue("QueryHotMoviesResponse.Message"));

		List<Movie> movies = new ArrayList<Movie>();
		for (int i = 0; i < _ctx.lengthValue("QueryHotMoviesResponse.Movies.Length"); i++) {
			Movie movie = new Movie();
			movie.setBackgroundPicture(_ctx.stringValue("QueryHotMoviesResponse.Movies["+ i +"].BackgroundPicture"));
			movie.setCountry(_ctx.stringValue("QueryHotMoviesResponse.Movies["+ i +"].Country"));
			movie.setDescription(_ctx.stringValue("QueryHotMoviesResponse.Movies["+ i +"].Description"));
			movie.setDirector(_ctx.stringValue("QueryHotMoviesResponse.Movies["+ i +"].Director"));
			movie.setDuration(_ctx.longValue("QueryHotMoviesResponse.Movies["+ i +"].Duration"));
			movie.setHighlight(_ctx.stringValue("QueryHotMoviesResponse.Movies["+ i +"].Highlight"));
			movie.setId(_ctx.longValue("QueryHotMoviesResponse.Movies["+ i +"].Id"));
			movie.setLanguage(_ctx.stringValue("QueryHotMoviesResponse.Movies["+ i +"].Language"));
			movie.setLeadingRole(_ctx.stringValue("QueryHotMoviesResponse.Movies["+ i +"].LeadingRole"));
			movie.setOpenDay(_ctx.stringValue("QueryHotMoviesResponse.Movies["+ i +"].OpenDay"));
			movie.setOpenTime(_ctx.stringValue("QueryHotMoviesResponse.Movies["+ i +"].OpenTime"));
			movie.setPoster(_ctx.stringValue("QueryHotMoviesResponse.Movies["+ i +"].Poster"));
			movie.setRemark(_ctx.stringValue("QueryHotMoviesResponse.Movies["+ i +"].Remark"));
			movie.setMovieVersion(_ctx.stringValue("QueryHotMoviesResponse.Movies["+ i +"].MovieVersion"));
			movie.setMovieName(_ctx.stringValue("QueryHotMoviesResponse.Movies["+ i +"].MovieName"));
			movie.setMovieNameEn(_ctx.stringValue("QueryHotMoviesResponse.Movies["+ i +"].MovieNameEn"));
			movie.setType(_ctx.stringValue("QueryHotMoviesResponse.Movies["+ i +"].Type"));

			List<String> movieTypeList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryHotMoviesResponse.Movies["+ i +"].MovieTypeList.Length"); j++) {
				movieTypeList.add(_ctx.stringValue("QueryHotMoviesResponse.Movies["+ i +"].MovieTypeList["+ j +"]"));
			}
			movie.setMovieTypeList(movieTypeList);

			List<String> trailerList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryHotMoviesResponse.Movies["+ i +"].TrailerList.Length"); j++) {
				trailerList.add(_ctx.stringValue("QueryHotMoviesResponse.Movies["+ i +"].TrailerList["+ j +"]"));
			}
			movie.setTrailerList(trailerList);

			movies.add(movie);
		}
		queryHotMoviesResponse.setMovies(movies);
	 
	 	return queryHotMoviesResponse;
	}
}