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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.GetAdviceTrendResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetAdviceTrendResponse.CountDO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAdviceTrendResponseUnmarshaller {

	public static GetAdviceTrendResponse unmarshall(GetAdviceTrendResponse getAdviceTrendResponse, UnmarshallerContext _ctx) {
		
		getAdviceTrendResponse.setRequestId(_ctx.stringValue("GetAdviceTrendResponse.RequestId"));

		List<CountDO> data = new ArrayList<CountDO>();
		for (int i = 0; i < _ctx.lengthValue("GetAdviceTrendResponse.Data.Length"); i++) {
			CountDO countDO = new CountDO();
			countDO.setDate(_ctx.stringValue("GetAdviceTrendResponse.Data["+ i +"].Date"));
			countDO.setRiskNum(_ctx.longValue("GetAdviceTrendResponse.Data["+ i +"].RiskNum"));
			countDO.setCount(_ctx.integerValue("GetAdviceTrendResponse.Data["+ i +"].Count"));

			data.add(countDO);
		}
		getAdviceTrendResponse.setData(data);
	 
	 	return getAdviceTrendResponse;
	}
}