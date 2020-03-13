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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.DescribeDSTAppResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTAppResponse.App;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDSTAppResponseUnmarshaller {

	public static DescribeDSTAppResponse unmarshall(DescribeDSTAppResponse describeDSTAppResponse, UnmarshallerContext _ctx) {
		
		describeDSTAppResponse.setRequestId(_ctx.stringValue("DescribeDSTAppResponse.RequestId"));
		describeDSTAppResponse.setResultCode(_ctx.stringValue("DescribeDSTAppResponse.ResultCode"));
		describeDSTAppResponse.setResultMessage(_ctx.stringValue("DescribeDSTAppResponse.ResultMessage"));

		App app = new App();
		app.setBizLogEnabled(_ctx.booleanValue("DescribeDSTAppResponse.App.BizLogEnabled"));
		app.setCollected(_ctx.booleanValue("DescribeDSTAppResponse.App.Collected"));
		app.setName(_ctx.stringValue("DescribeDSTAppResponse.App.Name"));
		describeDSTAppResponse.setApp(app);
	 
	 	return describeDSTAppResponse;
	}
}