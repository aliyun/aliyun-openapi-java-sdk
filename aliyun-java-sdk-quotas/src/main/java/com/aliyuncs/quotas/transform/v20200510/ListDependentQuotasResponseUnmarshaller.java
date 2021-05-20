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

import com.aliyuncs.quotas.model.v20200510.ListDependentQuotasResponse;
import com.aliyuncs.quotas.model.v20200510.ListDependentQuotasResponse.QuotasItem;
import com.aliyuncs.quotas.model.v20200510.ListDependentQuotasResponse.QuotasItem.DimensionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDependentQuotasResponseUnmarshaller {

	public static ListDependentQuotasResponse unmarshall(ListDependentQuotasResponse listDependentQuotasResponse, UnmarshallerContext _ctx) {
		
		listDependentQuotasResponse.setRequestId(_ctx.stringValue("ListDependentQuotasResponse.RequestId"));

		List<QuotasItem> quotas = new ArrayList<QuotasItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDependentQuotasResponse.Quotas.Length"); i++) {
			QuotasItem quotasItem = new QuotasItem();
			quotasItem.setQuotaActionCode(_ctx.stringValue("ListDependentQuotasResponse.Quotas["+ i +"].QuotaActionCode"));
			quotasItem.setProductCode(_ctx.stringValue("ListDependentQuotasResponse.Quotas["+ i +"].ProductCode"));
			quotasItem.setScale(_ctx.floatValue("ListDependentQuotasResponse.Quotas["+ i +"].Scale"));

			List<DimensionsItem> dimensions = new ArrayList<DimensionsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDependentQuotasResponse.Quotas["+ i +"].Dimensions.Length"); j++) {
				DimensionsItem dimensionsItem = new DimensionsItem();
				dimensionsItem.setDimensionKey(_ctx.stringValue("ListDependentQuotasResponse.Quotas["+ i +"].Dimensions["+ j +"].DimensionKey"));

				List<String> dimensionValues = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListDependentQuotasResponse.Quotas["+ i +"].Dimensions["+ j +"].DimensionValues.Length"); k++) {
					dimensionValues.add(_ctx.stringValue("ListDependentQuotasResponse.Quotas["+ i +"].Dimensions["+ j +"].DimensionValues["+ k +"]"));
				}
				dimensionsItem.setDimensionValues(dimensionValues);

				List<String> dependentDimension = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListDependentQuotasResponse.Quotas["+ i +"].Dimensions["+ j +"].DependentDimension.Length"); k++) {
					dependentDimension.add(_ctx.stringValue("ListDependentQuotasResponse.Quotas["+ i +"].Dimensions["+ j +"].DependentDimension["+ k +"]"));
				}
				dimensionsItem.setDependentDimension(dependentDimension);

				dimensions.add(dimensionsItem);
			}
			quotasItem.setDimensions(dimensions);

			quotas.add(quotasItem);
		}
		listDependentQuotasResponse.setQuotas(quotas);
	 
	 	return listDependentQuotasResponse;
	}
}