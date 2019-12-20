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

package com.aliyuncs.ons.transform.v20190214;

import com.aliyuncs.ons.model.v20190214.OnsTopicStatusResponse;
import com.aliyuncs.ons.model.v20190214.OnsTopicStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsTopicStatusResponseUnmarshaller {

	public static OnsTopicStatusResponse unmarshall(OnsTopicStatusResponse onsTopicStatusResponse, UnmarshallerContext _ctx) {
		
		onsTopicStatusResponse.setRequestId(_ctx.stringValue("OnsTopicStatusResponse.RequestId"));
		onsTopicStatusResponse.setHelpUrl(_ctx.stringValue("OnsTopicStatusResponse.HelpUrl"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("OnsTopicStatusResponse.Data.TotalCount"));
		data.setLastTimeStamp(_ctx.longValue("OnsTopicStatusResponse.Data.LastTimeStamp"));
		data.setPerm(_ctx.integerValue("OnsTopicStatusResponse.Data.Perm"));
		onsTopicStatusResponse.setData(data);
	 
	 	return onsTopicStatusResponse;
	}
}