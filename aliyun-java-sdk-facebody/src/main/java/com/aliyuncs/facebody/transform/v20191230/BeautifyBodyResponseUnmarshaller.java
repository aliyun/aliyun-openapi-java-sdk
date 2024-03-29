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

package com.aliyuncs.facebody.transform.v20191230;

import com.aliyuncs.facebody.model.v20191230.BeautifyBodyResponse;
import com.aliyuncs.facebody.model.v20191230.BeautifyBodyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BeautifyBodyResponseUnmarshaller {

	public static BeautifyBodyResponse unmarshall(BeautifyBodyResponse beautifyBodyResponse, UnmarshallerContext _ctx) {
		
		beautifyBodyResponse.setRequestId(_ctx.stringValue("BeautifyBodyResponse.RequestId"));
		beautifyBodyResponse.setCode(_ctx.stringValue("BeautifyBodyResponse.Code"));
		beautifyBodyResponse.setMessage(_ctx.stringValue("BeautifyBodyResponse.Message"));

		Data data = new Data();
		data.setXFlowURL(_ctx.stringValue("BeautifyBodyResponse.Data.XFlowURL"));
		data.setYFlowURL(_ctx.stringValue("BeautifyBodyResponse.Data.YFlowURL"));
		data.setAction(_ctx.stringValue("BeautifyBodyResponse.Data.Action"));
		beautifyBodyResponse.setData(data);
	 
	 	return beautifyBodyResponse;
	}
}