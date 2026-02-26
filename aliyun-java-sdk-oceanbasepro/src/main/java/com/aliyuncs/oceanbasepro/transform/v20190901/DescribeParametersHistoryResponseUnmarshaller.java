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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeParametersHistoryResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeParametersHistoryResponse.Respond;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeParametersHistoryResponse.Respond.ParametersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParametersHistoryResponseUnmarshaller {

	public static DescribeParametersHistoryResponse unmarshall(DescribeParametersHistoryResponse describeParametersHistoryResponse, UnmarshallerContext _ctx) {
		
		describeParametersHistoryResponse.setRequestId(_ctx.stringValue("DescribeParametersHistoryResponse.RequestId"));

		Respond respond = new Respond();
		respond.setTotalCount(_ctx.integerValue("DescribeParametersHistoryResponse.Respond.TotalCount"));
		respond.setPageNumber(_ctx.integerValue("DescribeParametersHistoryResponse.Respond.PageNumber"));

		List<ParametersItem> parameters = new ArrayList<ParametersItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParametersHistoryResponse.Respond.Parameters.Length"); i++) {
			ParametersItem parametersItem = new ParametersItem();
			parametersItem.setStatus(_ctx.stringValue("DescribeParametersHistoryResponse.Respond.Parameters["+ i +"].Status"));
			parametersItem.setOldValue(_ctx.stringValue("DescribeParametersHistoryResponse.Respond.Parameters["+ i +"].OldValue"));
			parametersItem.setUpdateTime(_ctx.stringValue("DescribeParametersHistoryResponse.Respond.Parameters["+ i +"].UpdateTime"));
			parametersItem.setCreateTime(_ctx.stringValue("DescribeParametersHistoryResponse.Respond.Parameters["+ i +"].CreateTime"));
			parametersItem.setDimensionValue(_ctx.stringValue("DescribeParametersHistoryResponse.Respond.Parameters["+ i +"].DimensionValue"));
			parametersItem.setName(_ctx.stringValue("DescribeParametersHistoryResponse.Respond.Parameters["+ i +"].Name"));
			parametersItem.setNewValue(_ctx.stringValue("DescribeParametersHistoryResponse.Respond.Parameters["+ i +"].NewValue"));

			parameters.add(parametersItem);
		}
		respond.setParameters(parameters);
		describeParametersHistoryResponse.setRespond(respond);
	 
	 	return describeParametersHistoryResponse;
	}
}