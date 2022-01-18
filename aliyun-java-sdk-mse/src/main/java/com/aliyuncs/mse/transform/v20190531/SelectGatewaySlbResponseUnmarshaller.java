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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.SelectGatewaySlbResponse;
import com.aliyuncs.mse.model.v20190531.SelectGatewaySlbResponse.Sources;
import com.aliyuncs.transform.UnmarshallerContext;


public class SelectGatewaySlbResponseUnmarshaller {

	public static SelectGatewaySlbResponse unmarshall(SelectGatewaySlbResponse selectGatewaySlbResponse, UnmarshallerContext _ctx) {
		
		selectGatewaySlbResponse.setRequestId(_ctx.stringValue("SelectGatewaySlbResponse.RequestId"));
		selectGatewaySlbResponse.setHttpStatusCode(_ctx.integerValue("SelectGatewaySlbResponse.HttpStatusCode"));
		selectGatewaySlbResponse.setMessage(_ctx.stringValue("SelectGatewaySlbResponse.Message"));
		selectGatewaySlbResponse.setCode(_ctx.integerValue("SelectGatewaySlbResponse.Code"));
		selectGatewaySlbResponse.setSuccess(_ctx.booleanValue("SelectGatewaySlbResponse.Success"));

		List<Sources> data = new ArrayList<Sources>();
		for (int i = 0; i < _ctx.lengthValue("SelectGatewaySlbResponse.Data.Length"); i++) {
			Sources sources = new Sources();
			sources.setSlbId(_ctx.stringValue("SelectGatewaySlbResponse.Data["+ i +"].SlbId"));
			sources.setSlbName(_ctx.stringValue("SelectGatewaySlbResponse.Data["+ i +"].SlbName"));

			data.add(sources);
		}
		selectGatewaySlbResponse.setData(data);
	 
	 	return selectGatewaySlbResponse;
	}
}