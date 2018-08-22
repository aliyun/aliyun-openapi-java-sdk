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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeParameterModificationHistoryResponse;
import com.aliyuncs.dds.model.v20151201.DescribeParameterModificationHistoryResponse.HistoricalParameter;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParameterModificationHistoryResponseUnmarshaller {

	public static DescribeParameterModificationHistoryResponse unmarshall(DescribeParameterModificationHistoryResponse describeParameterModificationHistoryResponse, UnmarshallerContext context) {
		
		describeParameterModificationHistoryResponse.setRequestId(context.stringValue("DescribeParameterModificationHistoryResponse.RequestId"));

		List<HistoricalParameter> historicalParameters = new ArrayList<HistoricalParameter>();
		for (int i = 0; i < context.lengthValue("DescribeParameterModificationHistoryResponse.HistoricalParameters.Length"); i++) {
			HistoricalParameter historicalParameter = new HistoricalParameter();
			historicalParameter.setParameterName(context.stringValue("DescribeParameterModificationHistoryResponse.HistoricalParameters["+ i +"].ParameterName"));
			historicalParameter.setModifyTime(context.stringValue("DescribeParameterModificationHistoryResponse.HistoricalParameters["+ i +"].ModifyTime"));
			historicalParameter.setOldParameterValue(context.stringValue("DescribeParameterModificationHistoryResponse.HistoricalParameters["+ i +"].OldParameterValue"));
			historicalParameter.setNewParameterValue(context.stringValue("DescribeParameterModificationHistoryResponse.HistoricalParameters["+ i +"].NewParameterValue"));

			historicalParameters.add(historicalParameter);
		}
		describeParameterModificationHistoryResponse.setHistoricalParameters(historicalParameters);
	 
	 	return describeParameterModificationHistoryResponse;
	}
}