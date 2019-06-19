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

import com.aliyuncs.linkedmall.model.v20180116.QueryUpcomingMoviesResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryUpcomingMoviesResponse.Movie;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUpcomingMoviesResponseUnmarshaller {

	public static QueryUpcomingMoviesResponse unmarshall(QueryUpcomingMoviesResponse queryUpcomingMoviesResponse, UnmarshallerContext context) {
		
		queryUpcomingMoviesResponse.setRequestId(context.stringValue("QueryUpcomingMoviesResponse.RequestId"));
		queryUpcomingMoviesResponse.setCode(context.stringValue("QueryUpcomingMoviesResponse.Code"));
		queryUpcomingMoviesResponse.setMessage(context.stringValue("QueryUpcomingMoviesResponse.Message"));
		queryUpcomingMoviesResponse.setSubCode(context.stringValue("QueryUpcomingMoviesResponse.SubCode"));
		queryUpcomingMoviesResponse.setSubMessage(context.stringValue("QueryUpcomingMoviesResponse.SubMessage"));
		queryUpcomingMoviesResponse.setLogsId(context.stringValue("QueryUpcomingMoviesResponse.LogsId"));
		queryUpcomingMoviesResponse.setSuccess(context.booleanValue("QueryUpcomingMoviesResponse.Success"));
		queryUpcomingMoviesResponse.setTotalCount(context.longValue("QueryUpcomingMoviesResponse.TotalCount"));

		List<Movie> movies = new ArrayList<Movie>();
		for (int i = 0; i < context.lengthValue("QueryUpcomingMoviesResponse.Movies.Length"); i++) {
			Movie movie = new Movie();
			movie.setId(context.longValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Id"));
			movie.setBackgroundPicture(context.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].BackgroundPicture"));
			movie.setHighlight(context.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Highlight"));
			movie.setOpenTime(context.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].OpenTime"));
			movie.setMovieTypeList(context.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].MovieTypeList"));
			movie.setMovieVersion(context.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].MovieVersion"));
			movie.setDescription(context.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Description"));
			movie.setPoster(context.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Poster"));
			movie.setTrailerList(context.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].TrailerList"));
			movie.setOpenDay(context.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].OpenDay"));
			movie.setDuration(context.longValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Duration"));
			movie.setLanguage(context.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Language"));
			movie.setCountry(context.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Country"));
			movie.setType(context.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Type"));
			movie.setLeadingRole(context.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].LeadingRole"));
			movie.setDirector(context.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Director"));
			movie.setMovieNameEn(context.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].MovieNameEn"));
			movie.setMovieName(context.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].MovieName"));
			movie.setRemark(context.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Remark"));

			movies.add(movie);
		}
		queryUpcomingMoviesResponse.setMovies(movies);
	 
	 	return queryUpcomingMoviesResponse;
	}
}