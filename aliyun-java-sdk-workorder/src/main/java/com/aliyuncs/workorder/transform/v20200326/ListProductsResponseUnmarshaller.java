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

package com.aliyuncs.workorder.transform.v20200326;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.workorder.model.v20200326.ListProductsResponse;
import com.aliyuncs.workorder.model.v20200326.ListProductsResponse.Data;
import com.aliyuncs.workorder.model.v20200326.ListProductsResponse.Data.ConsultationMoreItem;
import com.aliyuncs.workorder.model.v20200326.ListProductsResponse.Data.HotConsultationItem;
import com.aliyuncs.workorder.model.v20200326.ListProductsResponse.Data.HotTechItem;
import com.aliyuncs.workorder.model.v20200326.ListProductsResponse.Data.TechMoreItem;
import com.aliyuncs.workorder.model.v20200326.ListProductsResponse.Data.TechMoreItem.ProductListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProductsResponseUnmarshaller {

	public static ListProductsResponse unmarshall(ListProductsResponse listProductsResponse, UnmarshallerContext _ctx) {
		
		listProductsResponse.setRequestId(_ctx.stringValue("ListProductsResponse.RequestId"));
		listProductsResponse.setCode(_ctx.integerValue("ListProductsResponse.Code"));
		listProductsResponse.setSuccess(_ctx.booleanValue("ListProductsResponse.Success"));
		listProductsResponse.setMessage(_ctx.stringValue("ListProductsResponse.Message"));

		Data data = new Data();

		List<TechMoreItem> techMore = new ArrayList<TechMoreItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProductsResponse.Data.TechMore.Length"); i++) {
			TechMoreItem techMoreItem = new TechMoreItem();
			techMoreItem.setGroupName(_ctx.stringValue("ListProductsResponse.Data.TechMore["+ i +"].GroupName"));

			List<ProductListItem> productList = new ArrayList<ProductListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListProductsResponse.Data.TechMore["+ i +"].ProductList.Length"); j++) {
				ProductListItem productListItem = new ProductListItem();
				productListItem.setName(_ctx.stringValue("ListProductsResponse.Data.TechMore["+ i +"].ProductList["+ j +"].Name"));
				productListItem.setProductCode(_ctx.stringValue("ListProductsResponse.Data.TechMore["+ i +"].ProductList["+ j +"].ProductCode"));
				productListItem.setDescription(_ctx.stringValue("ListProductsResponse.Data.TechMore["+ i +"].ProductList["+ j +"].Description"));

				productList.add(productListItem);
			}
			techMoreItem.setProductList(productList);

			techMore.add(techMoreItem);
		}
		data.setTechMore(techMore);

		List<HotConsultationItem> hotConsultation = new ArrayList<HotConsultationItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProductsResponse.Data.HotConsultation.Length"); i++) {
			HotConsultationItem hotConsultationItem = new HotConsultationItem();
			hotConsultationItem.setName(_ctx.stringValue("ListProductsResponse.Data.HotConsultation["+ i +"].Name"));
			hotConsultationItem.setProductCode(_ctx.stringValue("ListProductsResponse.Data.HotConsultation["+ i +"].ProductCode"));
			hotConsultationItem.setDescription(_ctx.stringValue("ListProductsResponse.Data.HotConsultation["+ i +"].Description"));

			hotConsultation.add(hotConsultationItem);
		}
		data.setHotConsultation(hotConsultation);

		List<ConsultationMoreItem> consultationMore = new ArrayList<ConsultationMoreItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProductsResponse.Data.ConsultationMore.Length"); i++) {
			ConsultationMoreItem consultationMoreItem = new ConsultationMoreItem();
			consultationMoreItem.setName(_ctx.stringValue("ListProductsResponse.Data.ConsultationMore["+ i +"].Name"));
			consultationMoreItem.setProductCode(_ctx.stringValue("ListProductsResponse.Data.ConsultationMore["+ i +"].ProductCode"));
			consultationMoreItem.setDescription(_ctx.stringValue("ListProductsResponse.Data.ConsultationMore["+ i +"].Description"));

			consultationMore.add(consultationMoreItem);
		}
		data.setConsultationMore(consultationMore);

		List<HotTechItem> hotTech = new ArrayList<HotTechItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProductsResponse.Data.HotTech.Length"); i++) {
			HotTechItem hotTechItem = new HotTechItem();
			hotTechItem.setName(_ctx.stringValue("ListProductsResponse.Data.HotTech["+ i +"].Name"));
			hotTechItem.setProductCode(_ctx.stringValue("ListProductsResponse.Data.HotTech["+ i +"].ProductCode"));
			hotTechItem.setDescription(_ctx.stringValue("ListProductsResponse.Data.HotTech["+ i +"].Description"));

			hotTech.add(hotTechItem);
		}
		data.setHotTech(hotTech);
		listProductsResponse.setData(data);
	 
	 	return listProductsResponse;
	}
}