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

	public static QueryHotMoviesResponse unmarshall(QueryHotMoviesResponse queryHotMoviesResponse, UnmarshallerContext context) {
		
		queryHotMoviesResponse.setRequestId(context.stringValue("QueryHotMoviesResponse.RequestId"));
		queryHotMoviesResponse.setLogsId(context.stringValue("QueryHotMoviesResponse.LogsId"));
		queryHotMoviesResponse.setSubCode(context.stringValue("QueryHotMoviesResponse.SubCode"));
		queryHotMoviesResponse.setSubMessage(context.stringValue("QueryHotMoviesResponse.SubMessage"));
		queryHotMoviesResponse.setCode(context.stringValue("QueryHotMoviesResponse.Code"));
		queryHotMoviesResponse.setSuccess(context.booleanValue("QueryHotMoviesResponse.Success"));
		queryHotMoviesResponse.setMessage(context.stringValue("QueryHotMoviesResponse.Message"));

		List<Movie> movies = new ArrayList<Movie>();
		for (int i = 0; i < context.lengthValue("QueryHotMoviesResponse.Movies.Length"); i++) {
			Movie movie = new Movie();
			movie.setBackgroundPicture(context.stringValue("QueryHotMoviesResponse.Movies["+ i +"].BackgroundPicture"));
			movie.setCountry(context.stringValue("QueryHotMoviesResponse.Movies["+ i +"].Country"));
			movie.setDescription(context.stringValue("QueryHotMoviesResponse.Movies["+ i +"].Description"));
			movie.setDirector(context.stringValue("QueryHotMoviesResponse.Movies["+ i +"].Director"));
			movie.setDuration(context.longValue("QueryHotMoviesResponse.Movies["+ i +"].Duration"));
			movie.setHighlight(context.stringValue("QueryHotMoviesResponse.Movies["+ i +"].Highlight"));
			movie.setId(context.longValue("QueryHotMoviesResponse.Movies["+ i +"].Id"));
			movie.setLanguage(context.stringValue("QueryHotMoviesResponse.Movies["+ i +"].Language"));
			movie.setLeadingRole(context.stringValue("QueryHotMoviesResponse.Movies["+ i +"].LeadingRole"));
			movie.setOpenDay(context.stringValue("QueryHotMoviesResponse.Movies["+ i +"].OpenDay"));
			movie.setOpenTime(context.stringValue("QueryHotMoviesResponse.Movies["+ i +"].OpenTime"));
			movie.setPoster(context.stringValue("QueryHotMoviesResponse.Movies["+ i +"].Poster"));
			movie.setRemark(context.stringValue("QueryHotMoviesResponse.Movies["+ i +"].Remark"));
			movie.setMovieVersion(context.stringValue("QueryHotMoviesResponse.Movies["+ i +"].MovieVersion"));
			movie.setMovieName(context.stringValue("QueryHotMoviesResponse.Movies["+ i +"].MovieName"));
			movie.setMovieNameEn(context.stringValue("QueryHotMoviesResponse.Movies["+ i +"].MovieNameEn"));
			movie.setType(context.stringValue("QueryHotMoviesResponse.Movies["+ i +"].Type"));

			List<String> movieTypeList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryHotMoviesResponse.Movies["+ i +"].MovieTypeList.Length"); j++) {
				movieTypeList.add(context.stringValue("QueryHotMoviesResponse.Movies["+ i +"].MovieTypeList["+ j +"]"));
			}
			movie.setMovieTypeList(movieTypeList);

			List<String> trailerList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryHotMoviesResponse.Movies["+ i +"].TrailerList.Length"); j++) {
				trailerList.add(context.stringValue("QueryHotMoviesResponse.Movies["+ i +"].TrailerList["+ j +"]"));
			}
			movie.setTrailerList(trailerList);

			movies.add(movie);
		}
		queryHotMoviesResponse.setMovies(movies);
	 
	 	return queryHotMoviesResponse;
	}
}