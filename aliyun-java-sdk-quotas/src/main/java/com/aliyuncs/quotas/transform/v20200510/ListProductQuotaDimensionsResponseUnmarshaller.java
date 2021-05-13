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

import com.aliyuncs.quotas.model.v20200510.ListProductQuotaDimensionsResponse;
import com.aliyuncs.quotas.model.v20200510.ListProductQuotaDimensionsResponse.QuotaDimensionsItem;
import com.aliyuncs.quotas.model.v20200510.ListProductQuotaDimensionsResponse.QuotaDimensionsItem.DimensionValueDetailItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProductQuotaDimensionsResponseUnmarshaller {

	public static ListProductQuotaDimensionsResponse unmarshall(ListProductQuotaDimensionsResponse listProductQuotaDimensionsResponse, UnmarshallerContext _ctx) {
		
		listProductQuotaDimensionsResponse.setRequestId(_ctx.stringValue("ListProductQuotaDimensionsResponse.RequestId"));
		listProductQuotaDimensionsResponse.setTotalCount(_ctx.integerValue("ListProductQuotaDimensionsResponse.TotalCount"));
		listProductQuotaDimensionsResponse.setNextToken(_ctx.stringValue("ListProductQuotaDimensionsResponse.NextToken"));
		listProductQuotaDimensionsResponse.setMaxResults(_ctx.integerValue("ListProductQuotaDimensionsResponse.MaxResults"));

		List<QuotaDimensionsItem> quotaDimensions = new ArrayList<QuotaDimensionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProductQuotaDimensionsResponse.QuotaDimensions.Length"); i++) {
			QuotaDimensionsItem quotaDimensionsItem = new QuotaDimensionsItem();
			quotaDimensionsItem.setDimensionKey(_ctx.stringValue("ListProductQuotaDimensionsResponse.QuotaDimensions["+ i +"].DimensionKey"));
			quotaDimensionsItem.setName(_ctx.stringValue("ListProductQuotaDimensionsResponse.QuotaDimensions["+ i +"].Name"));
			quotaDimensionsItem.setRequisite(_ctx.booleanValue("ListProductQuotaDimensionsResponse.QuotaDimensions["+ i +"].Requisite"));

			List<String> dimensionValues = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListProductQuotaDimensionsResponse.QuotaDimensions["+ i +"].DimensionValues.Length"); j++) {
				dimensionValues.add(_ctx.stringValue("ListProductQuotaDimensionsResponse.QuotaDimensions["+ i +"].DimensionValues["+ j +"]"));
			}
			quotaDimensionsItem.setDimensionValues(dimensionValues);

			List<String> dependentDimensions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListProductQuotaDimensionsResponse.QuotaDimensions["+ i +"].DependentDimensions.Length"); j++) {
				dependentDimensions.add(_ctx.stringValue("ListProductQuotaDimensionsResponse.QuotaDimensions["+ i +"].DependentDimensions["+ j +"]"));
			}
			quotaDimensionsItem.setDependentDimensions(dependentDimensions);

			List<DimensionValueDetailItem> dimensionValueDetail = new ArrayList<DimensionValueDetailItem>();
			for (int j = 0; j < _ctx.lengthValue("ListProductQuotaDimensionsResponse.QuotaDimensions["+ i +"].DimensionValueDetail.Length"); j++) {
				DimensionValueDetailItem dimensionValueDetailItem = new DimensionValueDetailItem();
				dimensionValueDetailItem.setValue(_ctx.stringValue("ListProductQuotaDimensionsResponse.QuotaDimensions["+ i +"].DimensionValueDetail["+ j +"].Value"));
				dimensionValueDetailItem.setName(_ctx.stringValue("ListProductQuotaDimensionsResponse.QuotaDimensions["+ i +"].DimensionValueDetail["+ j +"].Name"));

				dimensionValueDetail.add(dimensionValueDetailItem);
			}
			quotaDimensionsItem.setDimensionValueDetail(dimensionValueDetail);

			quotaDimensions.add(quotaDimensionsItem);
		}
		listProductQuotaDimensionsResponse.setQuotaDimensions(quotaDimensions);
	 
	 	return listProductQuotaDimensionsResponse;
	}
}