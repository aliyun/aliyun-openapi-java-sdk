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

import com.aliyuncs.linkedmall.model.v20180116.QueryMovieSeatsResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryMovieSeatsResponse.SeatMap;
import com.aliyuncs.linkedmall.model.v20180116.QueryMovieSeatsResponse.SeatMap.Seat;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMovieSeatsResponseUnmarshaller {

	public static QueryMovieSeatsResponse unmarshall(QueryMovieSeatsResponse queryMovieSeatsResponse, UnmarshallerContext context) {
		
		queryMovieSeatsResponse.setRequestId(context.stringValue("QueryMovieSeatsResponse.RequestId"));
		queryMovieSeatsResponse.setCode(context.stringValue("QueryMovieSeatsResponse.Code"));
		queryMovieSeatsResponse.setMessage(context.stringValue("QueryMovieSeatsResponse.Message"));
		queryMovieSeatsResponse.setSubCode(context.stringValue("QueryMovieSeatsResponse.SubCode"));
		queryMovieSeatsResponse.setSubMessage(context.stringValue("QueryMovieSeatsResponse.SubMessage"));
		queryMovieSeatsResponse.setLogsId(context.stringValue("QueryMovieSeatsResponse.LogsId"));
		queryMovieSeatsResponse.setSuccess(context.booleanValue("QueryMovieSeatsResponse.Success"));

		SeatMap seatMap = new SeatMap();
		seatMap.setMaxCanBuy(context.longValue("QueryMovieSeatsResponse.SeatMap.MaxCanBuy"));
		seatMap.setMaxColumn(context.longValue("QueryMovieSeatsResponse.SeatMap.MaxColumn"));
		seatMap.setMaxLeftPx(context.longValue("QueryMovieSeatsResponse.SeatMap.MaxLeftPx"));
		seatMap.setMaxRow(context.longValue("QueryMovieSeatsResponse.SeatMap.MaxRow"));
		seatMap.setMaxTopPx(context.longValue("QueryMovieSeatsResponse.SeatMap.MaxTopPx"));
		seatMap.setMinColumn(context.longValue("QueryMovieSeatsResponse.SeatMap.MinColumn"));
		seatMap.setMinLeftPx(context.longValue("QueryMovieSeatsResponse.SeatMap.MinLeftPx"));
		seatMap.setMinRow(context.longValue("QueryMovieSeatsResponse.SeatMap.MinRow"));
		seatMap.setMinTopPx(context.longValue("QueryMovieSeatsResponse.SeatMap.MinTopPx"));
		seatMap.setNotice(context.stringValue("QueryMovieSeatsResponse.SeatMap.Notice"));
		seatMap.setRegular(context.booleanValue("QueryMovieSeatsResponse.SeatMap.Regular"));
		seatMap.setSeatCount(context.longValue("QueryMovieSeatsResponse.SeatMap.SeatCount"));
		seatMap.setSoldCount(context.longValue("QueryMovieSeatsResponse.SeatMap.SoldCount"));
		seatMap.setTipMessage(context.stringValue("QueryMovieSeatsResponse.SeatMap.TipMessage"));

		List<Seat> seats = new ArrayList<Seat>();
		for (int i = 0; i < context.lengthValue("QueryMovieSeatsResponse.SeatMap.Seats.Length"); i++) {
			Seat seat = new Seat();
			seat.setArea(context.stringValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].Area"));
			seat.setColumn(context.longValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].Column"));
			seat.setExtId(context.stringValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].ExtId"));
			seat.setFlag(context.longValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].Flag"));
			seat.setLeftPx(context.longValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].LeftPx"));
			seat.setName(context.stringValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].Name"));
			seat.setRow(context.longValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].Row"));
			seat.setRowName(context.stringValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].RowName"));
			seat.setStatus(context.longValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].Status"));
			seat.setTopPx(context.longValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].TopPx"));

			seats.add(seat);
		}
		seatMap.setSeats(seats);
		queryMovieSeatsResponse.setSeatMap(seatMap);
	 
	 	return queryMovieSeatsResponse;
	}
}