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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeUnbindFlowLogSagsResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeUnbindFlowLogSagsResponse.Sag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUnbindFlowLogSagsResponseUnmarshaller {

	public static DescribeUnbindFlowLogSagsResponse unmarshall(DescribeUnbindFlowLogSagsResponse describeUnbindFlowLogSagsResponse, UnmarshallerContext _ctx) {
		
		describeUnbindFlowLogSagsResponse.setRequestId(_ctx.stringValue("DescribeUnbindFlowLogSagsResponse.RequestId"));
		describeUnbindFlowLogSagsResponse.setCount(_ctx.integerValue("DescribeUnbindFlowLogSagsResponse.Count"));

		List<Sag> sags = new ArrayList<Sag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUnbindFlowLogSagsResponse.Sags.Length"); i++) {
			Sag sag = new Sag();
			sag.setDescription(_ctx.stringValue("DescribeUnbindFlowLogSagsResponse.Sags["+ i +"].Description"));
			sag.setSmartAGId(_ctx.stringValue("DescribeUnbindFlowLogSagsResponse.Sags["+ i +"].SmartAGId"));
			sag.setName(_ctx.stringValue("DescribeUnbindFlowLogSagsResponse.Sags["+ i +"].Name"));

			sags.add(sag);
		}
		describeUnbindFlowLogSagsResponse.setSags(sags);
	 
	 	return describeUnbindFlowLogSagsResponse;
	}
}