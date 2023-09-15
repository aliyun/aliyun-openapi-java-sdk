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

package com.aliyuncs.cams.transform.v20200606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cams.model.v20200606.BeeBotAssociateResponse;
import com.aliyuncs.cams.model.v20200606.BeeBotAssociateResponse.Data;
import com.aliyuncs.cams.model.v20200606.BeeBotAssociateResponse.Data.联想的列表;
import com.aliyuncs.transform.UnmarshallerContext;


public class BeeBotAssociateResponseUnmarshaller {

	public static BeeBotAssociateResponse unmarshall(BeeBotAssociateResponse beeBotAssociateResponse, UnmarshallerContext _ctx) {
		
		beeBotAssociateResponse.setRequestId(_ctx.stringValue("BeeBotAssociateResponse.RequestId"));
		beeBotAssociateResponse.setCode(_ctx.stringValue("BeeBotAssociateResponse.Code"));
		beeBotAssociateResponse.setMessage(_ctx.stringValue("BeeBotAssociateResponse.Message"));
		beeBotAssociateResponse.setAccessDeniedDetail(_ctx.stringValue("BeeBotAssociateResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setMessageId(_ctx.stringValue("BeeBotAssociateResponse.Data.MessageId"));
		data.setSessionId(_ctx.stringValue("BeeBotAssociateResponse.Data.SessionId"));

		List<联想的列表> associate = new ArrayList<联想的列表>();
		for (int i = 0; i < _ctx.lengthValue("BeeBotAssociateResponse.Data.Associate.Length"); i++) {
			联想的列表 联想的列表 = new 联想的列表();
			联想的列表.setMeta(_ctx.stringValue("BeeBotAssociateResponse.Data.Associate["+ i +"].Meta"));
			联想的列表.setTitle(_ctx.stringValue("BeeBotAssociateResponse.Data.Associate["+ i +"].Title"));

			associate.add(联想的列表);
		}
		data.setAssociate(associate);
		beeBotAssociateResponse.setData(data);
	 
	 	return beeBotAssociateResponse;
	}
}