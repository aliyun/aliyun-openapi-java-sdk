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

package com.aliyuncs.appmallsservice.transform.v20180224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmGetSeatsResponse;
import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmGetSeatsResponse.SeatMap;
import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmGetSeatsResponse.SeatMap.SeatsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class TaobaoFilmGetSeatsResponseUnmarshaller {

	public static TaobaoFilmGetSeatsResponse unmarshall(TaobaoFilmGetSeatsResponse taobaoFilmGetSeatsResponse, UnmarshallerContext _ctx) {
		
		taobaoFilmGetSeatsResponse.setRequestId(_ctx.stringValue("TaobaoFilmGetSeatsResponse.RequestId"));
		taobaoFilmGetSeatsResponse.setErrorCode(_ctx.stringValue("TaobaoFilmGetSeatsResponse.ErrorCode"));
		taobaoFilmGetSeatsResponse.setMsg(_ctx.stringValue("TaobaoFilmGetSeatsResponse.Msg"));
		taobaoFilmGetSeatsResponse.setSubCode(_ctx.stringValue("TaobaoFilmGetSeatsResponse.SubCode"));
		taobaoFilmGetSeatsResponse.setSubMsg(_ctx.stringValue("TaobaoFilmGetSeatsResponse.SubMsg"));
		taobaoFilmGetSeatsResponse.setLogsId(_ctx.stringValue("TaobaoFilmGetSeatsResponse.LogsId"));

		SeatMap seatMap = new SeatMap();
		seatMap.setMaxCanBuy(_ctx.longValue("TaobaoFilmGetSeatsResponse.SeatMap.MaxCanBuy"));
		seatMap.setMaxColumn(_ctx.longValue("TaobaoFilmGetSeatsResponse.SeatMap.MaxColumn"));
		seatMap.setMaxLeftPx(_ctx.longValue("TaobaoFilmGetSeatsResponse.SeatMap.MaxLeftPx"));
		seatMap.setMaxRow(_ctx.longValue("TaobaoFilmGetSeatsResponse.SeatMap.MaxRow"));
		seatMap.setMaxTopPx(_ctx.longValue("TaobaoFilmGetSeatsResponse.SeatMap.MaxTopPx"));
		seatMap.setMinColumn(_ctx.longValue("TaobaoFilmGetSeatsResponse.SeatMap.MinColumn"));
		seatMap.setMinLeftPx(_ctx.longValue("TaobaoFilmGetSeatsResponse.SeatMap.MinLeftPx"));
		seatMap.setMinRow(_ctx.longValue("TaobaoFilmGetSeatsResponse.SeatMap.MinRow"));
		seatMap.setMinTopPx(_ctx.longValue("TaobaoFilmGetSeatsResponse.SeatMap.MinTopPx"));
		seatMap.setNotice(_ctx.stringValue("TaobaoFilmGetSeatsResponse.SeatMap.Notice"));
		seatMap.setRegular(_ctx.booleanValue("TaobaoFilmGetSeatsResponse.SeatMap.Regular"));
		seatMap.setSeatCount(_ctx.longValue("TaobaoFilmGetSeatsResponse.SeatMap.SeatCount"));
		seatMap.setSoldCount(_ctx.longValue("TaobaoFilmGetSeatsResponse.SeatMap.SoldCount"));
		seatMap.setTipMessage(_ctx.stringValue("TaobaoFilmGetSeatsResponse.SeatMap.TipMessage"));

		List<SeatsItem> seats = new ArrayList<SeatsItem>();
		for (int i = 0; i < _ctx.lengthValue("TaobaoFilmGetSeatsResponse.SeatMap.Seats.Length"); i++) {
			SeatsItem seatsItem = new SeatsItem();
			seatsItem.setArea(_ctx.stringValue("TaobaoFilmGetSeatsResponse.SeatMap.Seats["+ i +"].Area"));
			seatsItem.setColumn(_ctx.longValue("TaobaoFilmGetSeatsResponse.SeatMap.Seats["+ i +"].Column"));
			seatsItem.setExtId(_ctx.stringValue("TaobaoFilmGetSeatsResponse.SeatMap.Seats["+ i +"].ExtId"));
			seatsItem.setFlag(_ctx.longValue("TaobaoFilmGetSeatsResponse.SeatMap.Seats["+ i +"].Flag"));
			seatsItem.setLeftPx(_ctx.longValue("TaobaoFilmGetSeatsResponse.SeatMap.Seats["+ i +"].LeftPx"));
			seatsItem.setName(_ctx.stringValue("TaobaoFilmGetSeatsResponse.SeatMap.Seats["+ i +"].Name"));
			seatsItem.setRow(_ctx.longValue("TaobaoFilmGetSeatsResponse.SeatMap.Seats["+ i +"].Row"));
			seatsItem.setRowName(_ctx.stringValue("TaobaoFilmGetSeatsResponse.SeatMap.Seats["+ i +"].RowName"));
			seatsItem.setStatus(_ctx.longValue("TaobaoFilmGetSeatsResponse.SeatMap.Seats["+ i +"].Status"));
			seatsItem.setTopPx(_ctx.longValue("TaobaoFilmGetSeatsResponse.SeatMap.Seats["+ i +"].TopPx"));

			seats.add(seatsItem);
		}
		seatMap.setSeats(seats);
		taobaoFilmGetSeatsResponse.setSeatMap(seatMap);
	 
	 	return taobaoFilmGetSeatsResponse;
	}
}