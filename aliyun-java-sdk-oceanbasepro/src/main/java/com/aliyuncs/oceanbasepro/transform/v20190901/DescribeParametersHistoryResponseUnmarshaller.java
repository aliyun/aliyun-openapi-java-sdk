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
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeParametersHistoryResponse.Data;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeParametersHistoryResponse.Data.ParametersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParametersHistoryResponseUnmarshaller {

	public static DescribeParametersHistoryResponse unmarshall(DescribeParametersHistoryResponse describeParametersHistoryResponse, UnmarshallerContext _ctx) {
		
		describeParametersHistoryResponse.setRequestId(_ctx.stringValue("DescribeParametersHistoryResponse.RequestId"));

		List<Data> respond = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParametersHistoryResponse.Respond.Length"); i++) {
			Data data = new Data();
			data.setTotalCount(_ctx.integerValue("DescribeParametersHistoryResponse.Respond["+ i +"].TotalCount"));
			data.setPageNumber(_ctx.integerValue("DescribeParametersHistoryResponse.Respond["+ i +"].PageNumber"));

			List<ParametersItem> parameters = new ArrayList<ParametersItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeParametersHistoryResponse.Respond["+ i +"].Parameters.Length"); j++) {
				ParametersItem parametersItem = new ParametersItem();
				parametersItem.setStatus(_ctx.stringValue("DescribeParametersHistoryResponse.Respond["+ i +"].Parameters["+ j +"].Status"));
				parametersItem.setOldValue(_ctx.stringValue("DescribeParametersHistoryResponse.Respond["+ i +"].Parameters["+ j +"].OldValue"));
				parametersItem.setUpdateTime(_ctx.stringValue("DescribeParametersHistoryResponse.Respond["+ i +"].Parameters["+ j +"].UpdateTime"));
				parametersItem.setCreateTime(_ctx.stringValue("DescribeParametersHistoryResponse.Respond["+ i +"].Parameters["+ j +"].CreateTime"));
				parametersItem.setDimensionValue(_ctx.stringValue("DescribeParametersHistoryResponse.Respond["+ i +"].Parameters["+ j +"].DimensionValue"));
				parametersItem.setName(_ctx.stringValue("DescribeParametersHistoryResponse.Respond["+ i +"].Parameters["+ j +"].Name"));
				parametersItem.setNewValue(_ctx.stringValue("DescribeParametersHistoryResponse.Respond["+ i +"].Parameters["+ j +"].NewValue"));

				parameters.add(parametersItem);
			}
			data.setParameters(parameters);

			respond.add(data);
		}
		describeParametersHistoryResponse.setRespond(respond);
	 
	 	return describeParametersHistoryResponse;
	}
}