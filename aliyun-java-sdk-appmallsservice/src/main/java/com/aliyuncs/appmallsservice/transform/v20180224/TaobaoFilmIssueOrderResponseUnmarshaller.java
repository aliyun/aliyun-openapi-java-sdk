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

import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmIssueOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TaobaoFilmIssueOrderResponseUnmarshaller {

	public static TaobaoFilmIssueOrderResponse unmarshall(TaobaoFilmIssueOrderResponse taobaoFilmIssueOrderResponse, UnmarshallerContext _ctx) {
		
		taobaoFilmIssueOrderResponse.setRequestId(_ctx.stringValue("TaobaoFilmIssueOrderResponse.RequestId"));
		taobaoFilmIssueOrderResponse.setErrorCode(_ctx.stringValue("TaobaoFilmIssueOrderResponse.ErrorCode"));
		taobaoFilmIssueOrderResponse.setMsg(_ctx.stringValue("TaobaoFilmIssueOrderResponse.Msg"));
		taobaoFilmIssueOrderResponse.setSubCode(_ctx.stringValue("TaobaoFilmIssueOrderResponse.SubCode"));
		taobaoFilmIssueOrderResponse.setSubMsg(_ctx.stringValue("TaobaoFilmIssueOrderResponse.SubMsg"));
		taobaoFilmIssueOrderResponse.setMessage(_ctx.stringValue("TaobaoFilmIssueOrderResponse.Message"));
		taobaoFilmIssueOrderResponse.setStatus(_ctx.stringValue("TaobaoFilmIssueOrderResponse.Status"));
		taobaoFilmIssueOrderResponse.setTbOrderId(_ctx.stringValue("TaobaoFilmIssueOrderResponse.TbOrderId"));
		taobaoFilmIssueOrderResponse.setTicketContents(_ctx.stringValue("TaobaoFilmIssueOrderResponse.TicketContents"));
		taobaoFilmIssueOrderResponse.setLogsId(_ctx.stringValue("TaobaoFilmIssueOrderResponse.LogsId"));
	 
	 	return taobaoFilmIssueOrderResponse;
	}
}