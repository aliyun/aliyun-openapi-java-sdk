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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeExposedCheckWarningResponse;
import com.aliyuncs.sas.model.v20181203.DescribeExposedCheckWarningResponse.CheckWarning;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExposedCheckWarningResponseUnmarshaller {

	public static DescribeExposedCheckWarningResponse unmarshall(DescribeExposedCheckWarningResponse describeExposedCheckWarningResponse, UnmarshallerContext _ctx) {
		
		describeExposedCheckWarningResponse.setRequestId(_ctx.stringValue("DescribeExposedCheckWarningResponse.RequestId"));
		describeExposedCheckWarningResponse.setCount(_ctx.integerValue("DescribeExposedCheckWarningResponse.Count"));

		List<CheckWarning> warningList = new ArrayList<CheckWarning>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExposedCheckWarningResponse.WarningList.Length"); i++) {
			CheckWarning checkWarning = new CheckWarning();
			checkWarning.setSubTypeAlias(_ctx.stringValue("DescribeExposedCheckWarningResponse.WarningList["+ i +"].SubTypeAlias"));
			checkWarning.setUuid(_ctx.stringValue("DescribeExposedCheckWarningResponse.WarningList["+ i +"].Uuid"));
			checkWarning.setTypeAlias(_ctx.stringValue("DescribeExposedCheckWarningResponse.WarningList["+ i +"].TypeAlias"));
			checkWarning.setRiskName(_ctx.stringValue("DescribeExposedCheckWarningResponse.WarningList["+ i +"].RiskName"));
			checkWarning.setRiskId(_ctx.longValue("DescribeExposedCheckWarningResponse.WarningList["+ i +"].RiskId"));

			warningList.add(checkWarning);
		}
		describeExposedCheckWarningResponse.setWarningList(warningList);
	 
	 	return describeExposedCheckWarningResponse;
	}
}