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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerDescribeNcExpressionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerDescribeNcExpressionResponseUnmarshaller {

	public static InnerDescribeNcExpressionResponse unmarshall(InnerDescribeNcExpressionResponse innerDescribeNcExpressionResponse, UnmarshallerContext context) {
		
		innerDescribeNcExpressionResponse.setRequestId(context.stringValue("InnerDescribeNcExpressionResponse.RequestId"));
		innerDescribeNcExpressionResponse.setFinished(context.booleanValue("InnerDescribeNcExpressionResponse.Finished"));
		innerDescribeNcExpressionResponse.setTotalNcCount(context.integerValue("InnerDescribeNcExpressionResponse.TotalNcCount"));
		innerDescribeNcExpressionResponse.setFinishedNcCount(context.integerValue("InnerDescribeNcExpressionResponse.FinishedNcCount"));

		List<String> unfinishedNcIpSet = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerDescribeNcExpressionResponse.UnfinishedNcIpSet.Length"); i++) {
			unfinishedNcIpSet.add(context.stringValue("InnerDescribeNcExpressionResponse.UnfinishedNcIpSet["+ i +"]"));
		}
		innerDescribeNcExpressionResponse.setUnfinishedNcIpSet(unfinishedNcIpSet);
	 
	 	return innerDescribeNcExpressionResponse;
	}
}