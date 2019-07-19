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

	public static QueryUpcomingMoviesResponse unmarshall(QueryUpcomingMoviesResponse queryUpcomingMoviesResponse, UnmarshallerContext _ctx) {
		
		queryUpcomingMoviesResponse.setRequestId(_ctx.stringValue("QueryUpcomingMoviesResponse.RequestId"));
		queryUpcomingMoviesResponse.setCode(_ctx.stringValue("QueryUpcomingMoviesResponse.Code"));
		queryUpcomingMoviesResponse.setMessage(_ctx.stringValue("QueryUpcomingMoviesResponse.Message"));
		queryUpcomingMoviesResponse.setSubCode(_ctx.stringValue("QueryUpcomingMoviesResponse.SubCode"));
		queryUpcomingMoviesResponse.setSubMessage(_ctx.stringValue("QueryUpcomingMoviesResponse.SubMessage"));
		queryUpcomingMoviesResponse.setLogsId(_ctx.stringValue("QueryUpcomingMoviesResponse.LogsId"));
		queryUpcomingMoviesResponse.setSuccess(_ctx.booleanValue("QueryUpcomingMoviesResponse.Success"));
		queryUpcomingMoviesResponse.setTotalCount(_ctx.longValue("QueryUpcomingMoviesResponse.TotalCount"));

		List<Movie> movies = new ArrayList<Movie>();
		for (int i = 0; i < _ctx.lengthValue("QueryUpcomingMoviesResponse.Movies.Length"); i++) {
			Movie movie = new Movie();
			movie.setId(_ctx.longValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Id"));
			movie.setBackgroundPicture(_ctx.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].BackgroundPicture"));
			movie.setHighlight(_ctx.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Highlight"));
			movie.setOpenTime(_ctx.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].OpenTime"));
			movie.setMovieTypeList(_ctx.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].MovieTypeList"));
			movie.setMovieVersion(_ctx.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].MovieVersion"));
			movie.setDescription(_ctx.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Description"));
			movie.setPoster(_ctx.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Poster"));
			movie.setTrailerList(_ctx.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].TrailerList"));
			movie.setOpenDay(_ctx.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].OpenDay"));
			movie.setDuration(_ctx.longValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Duration"));
			movie.setLanguage(_ctx.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Language"));
			movie.setCountry(_ctx.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Country"));
			movie.setType(_ctx.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Type"));
			movie.setLeadingRole(_ctx.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].LeadingRole"));
			movie.setDirector(_ctx.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Director"));
			movie.setMovieNameEn(_ctx.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].MovieNameEn"));
			movie.setMovieName(_ctx.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].MovieName"));
			movie.setRemark(_ctx.stringValue("QueryUpcomingMoviesResponse.Movies["+ i +"].Remark"));

			movies.add(movie);
		}
		queryUpcomingMoviesResponse.setMovies(movies);
	 
	 	return queryUpcomingMoviesResponse;
	}
}