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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.BindSlbResponse;
import com.aliyuncs.edas.model.v20170801.BindSlbResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindSlbResponseUnmarshaller {

	public static BindSlbResponse unmarshall(BindSlbResponse bindSlbResponse, UnmarshallerContext _ctx) {
		
		bindSlbResponse.setRequestId(_ctx.stringValue("BindSlbResponse.RequestId"));
		bindSlbResponse.setCode(_ctx.integerValue("BindSlbResponse.Code"));
		bindSlbResponse.setMessage(_ctx.stringValue("BindSlbResponse.Message"));

		Data data = new Data();
		data.setSlbName(_ctx.stringValue("BindSlbResponse.Data.SlbName"));
		data.setSlbId(_ctx.stringValue("BindSlbResponse.Data.SlbId"));
		data.setSlbIp(_ctx.stringValue("BindSlbResponse.Data.SlbIp"));
		data.setExtSlbName(_ctx.stringValue("BindSlbResponse.Data.ExtSlbName"));
		data.setExtSlbId(_ctx.stringValue("BindSlbResponse.Data.ExtSlbId"));
		data.setExtSlbIp(_ctx.stringValue("BindSlbResponse.Data.ExtSlbIp"));
		data.setSlbPort(_ctx.integerValue("BindSlbResponse.Data.SlbPort"));
		data.setVServerGroupId(_ctx.stringValue("BindSlbResponse.Data.VServerGroupId"));
		data.setExtVServerGroupId(_ctx.stringValue("BindSlbResponse.Data.ExtVServerGroupId"));
		bindSlbResponse.setData(data);
	 
	 	return bindSlbResponse;
	}
}