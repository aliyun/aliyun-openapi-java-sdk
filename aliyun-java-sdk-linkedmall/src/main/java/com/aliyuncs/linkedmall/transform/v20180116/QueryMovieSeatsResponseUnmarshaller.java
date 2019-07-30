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

	public static QueryMovieSeatsResponse unmarshall(QueryMovieSeatsResponse queryMovieSeatsResponse, UnmarshallerContext _ctx) {
		
		queryMovieSeatsResponse.setRequestId(_ctx.stringValue("QueryMovieSeatsResponse.RequestId"));
		queryMovieSeatsResponse.setCode(_ctx.stringValue("QueryMovieSeatsResponse.Code"));
		queryMovieSeatsResponse.setMessage(_ctx.stringValue("QueryMovieSeatsResponse.Message"));
		queryMovieSeatsResponse.setSubCode(_ctx.stringValue("QueryMovieSeatsResponse.SubCode"));
		queryMovieSeatsResponse.setSubMessage(_ctx.stringValue("QueryMovieSeatsResponse.SubMessage"));
		queryMovieSeatsResponse.setLogsId(_ctx.stringValue("QueryMovieSeatsResponse.LogsId"));
		queryMovieSeatsResponse.setSuccess(_ctx.booleanValue("QueryMovieSeatsResponse.Success"));

		SeatMap seatMap = new SeatMap();
		seatMap.setMaxCanBuy(_ctx.longValue("QueryMovieSeatsResponse.SeatMap.MaxCanBuy"));
		seatMap.setMaxColumn(_ctx.longValue("QueryMovieSeatsResponse.SeatMap.MaxColumn"));
		seatMap.setMaxLeftPx(_ctx.longValue("QueryMovieSeatsResponse.SeatMap.MaxLeftPx"));
		seatMap.setMaxRow(_ctx.longValue("QueryMovieSeatsResponse.SeatMap.MaxRow"));
		seatMap.setMaxTopPx(_ctx.longValue("QueryMovieSeatsResponse.SeatMap.MaxTopPx"));
		seatMap.setMinColumn(_ctx.longValue("QueryMovieSeatsResponse.SeatMap.MinColumn"));
		seatMap.setMinLeftPx(_ctx.longValue("QueryMovieSeatsResponse.SeatMap.MinLeftPx"));
		seatMap.setMinRow(_ctx.longValue("QueryMovieSeatsResponse.SeatMap.MinRow"));
		seatMap.setMinTopPx(_ctx.longValue("QueryMovieSeatsResponse.SeatMap.MinTopPx"));
		seatMap.setNotice(_ctx.stringValue("QueryMovieSeatsResponse.SeatMap.Notice"));
		seatMap.setRegular(_ctx.booleanValue("QueryMovieSeatsResponse.SeatMap.Regular"));
		seatMap.setSeatCount(_ctx.longValue("QueryMovieSeatsResponse.SeatMap.SeatCount"));
		seatMap.setSoldCount(_ctx.longValue("QueryMovieSeatsResponse.SeatMap.SoldCount"));
		seatMap.setTipMessage(_ctx.stringValue("QueryMovieSeatsResponse.SeatMap.TipMessage"));

		List<Seat> seats = new ArrayList<Seat>();
		for (int i = 0; i < _ctx.lengthValue("QueryMovieSeatsResponse.SeatMap.Seats.Length"); i++) {
			Seat seat = new Seat();
			seat.setArea(_ctx.stringValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].Area"));
			seat.setColumn(_ctx.longValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].Column"));
			seat.setExtId(_ctx.stringValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].ExtId"));
			seat.setFlag(_ctx.longValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].Flag"));
			seat.setLeftPx(_ctx.longValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].LeftPx"));
			seat.setName(_ctx.stringValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].Name"));
			seat.setRow(_ctx.longValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].Row"));
			seat.setRowName(_ctx.stringValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].RowName"));
			seat.setStatus(_ctx.longValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].Status"));
			seat.setTopPx(_ctx.longValue("QueryMovieSeatsResponse.SeatMap.Seats["+ i +"].TopPx"));

			seats.add(seat);
		}
		seatMap.setSeats(seats);
		queryMovieSeatsResponse.setSeatMap(seatMap);
	 
	 	return queryMovieSeatsResponse;
	}
}