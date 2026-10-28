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

package com.aliyuncs.quotas.transform.v20200510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quotas.model.v20200510.GetProductQuotaDimensionResponse;
import com.aliyuncs.quotas.model.v20200510.GetProductQuotaDimensionResponse.QuotaDimension;
import com.aliyuncs.quotas.model.v20200510.GetProductQuotaDimensionResponse.QuotaDimension.DimensionValueDetailItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProductQuotaDimensionResponseUnmarshaller {

	public static GetProductQuotaDimensionResponse unmarshall(GetProductQuotaDimensionResponse getProductQuotaDimensionResponse, UnmarshallerContext _ctx) {
		
		getProductQuotaDimensionResponse.setRequestId(_ctx.stringValue("GetProductQuotaDimensionResponse.RequestId"));

		QuotaDimension quotaDimension = new QuotaDimension();
		quotaDimension.setDimensionKey(_ctx.stringValue("GetProductQuotaDimensionResponse.QuotaDimension.DimensionKey"));
		quotaDimension.setName(_ctx.stringValue("GetProductQuotaDimensionResponse.QuotaDimension.Name"));

		List<String> dimensionValues = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetProductQuotaDimensionResponse.QuotaDimension.DimensionValues.Length"); i++) {
			dimensionValues.add(_ctx.stringValue("GetProductQuotaDimensionResponse.QuotaDimension.DimensionValues["+ i +"]"));
		}
		quotaDimension.setDimensionValues(dimensionValues);

		List<String> dependentDimensions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetProductQuotaDimensionResponse.QuotaDimension.DependentDimensions.Length"); i++) {
			dependentDimensions.add(_ctx.stringValue("GetProductQuotaDimensionResponse.QuotaDimension.DependentDimensions["+ i +"]"));
		}
		quotaDimension.setDependentDimensions(dependentDimensions);

		List<DimensionValueDetailItem> dimensionValueDetail = new ArrayList<DimensionValueDetailItem>();
		for (int i = 0; i < _ctx.lengthValue("GetProductQuotaDimensionResponse.QuotaDimension.DimensionValueDetail.Length"); i++) {
			DimensionValueDetailItem dimensionValueDetailItem = new DimensionValueDetailItem();
			dimensionValueDetailItem.setValue(_ctx.stringValue("GetProductQuotaDimensionResponse.QuotaDimension.DimensionValueDetail["+ i +"].Value"));
			dimensionValueDetailItem.setName(_ctx.stringValue("GetProductQuotaDimensionResponse.QuotaDimension.DimensionValueDetail["+ i +"].Name"));

			dimensionValueDetail.add(dimensionValueDetailItem);
		}
		quotaDimension.setDimensionValueDetail(dimensionValueDetail);
		getProductQuotaDimensionResponse.setQuotaDimension(quotaDimension);
	 
	 	return getProductQuotaDimensionResponse;
	}
}