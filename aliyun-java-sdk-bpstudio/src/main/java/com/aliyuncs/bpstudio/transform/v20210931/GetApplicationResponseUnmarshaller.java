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

package com.aliyuncs.bpstudio.transform.v20210931;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bpstudio.model.v20210931.GetApplicationResponse;
import com.aliyuncs.bpstudio.model.v20210931.GetApplicationResponse.Data;
import com.aliyuncs.bpstudio.model.v20210931.GetApplicationResponse.Data.Item;
import com.aliyuncs.bpstudio.model.v20210931.GetApplicationResponse.Data.Item1;
import com.aliyuncs.bpstudio.model.v20210931.GetApplicationResponse.Data.Item2;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationResponseUnmarshaller {

	public static GetApplicationResponse unmarshall(GetApplicationResponse getApplicationResponse, UnmarshallerContext _ctx) {
		
		getApplicationResponse.setRequestId(_ctx.stringValue("GetApplicationResponse.RequestId"));
		getApplicationResponse.setMessage(_ctx.stringValue("GetApplicationResponse.Message"));
		getApplicationResponse.setCode(_ctx.integerValue("GetApplicationResponse.Code"));

		Data data = new Data();
		data.setDescription(_ctx.stringValue("GetApplicationResponse.Data.Description"));
		data.setImageURL(_ctx.stringValue("GetApplicationResponse.Data.ImageURL"));
		data.setApplicationId(_ctx.stringValue("GetApplicationResponse.Data.ApplicationId"));
		data.setName(_ctx.stringValue("GetApplicationResponse.Data.Name"));
		data.setTemplateId(_ctx.stringValue("GetApplicationResponse.Data.TemplateId"));
		data.setCreateTime(_ctx.stringValue("GetApplicationResponse.Data.CreateTime"));
		data.setResourceGroupId(_ctx.stringValue("GetApplicationResponse.Data.ResourceGroupId"));
		data.setStatus(_ctx.stringValue("GetApplicationResponse.Data.Status"));
		data.setError(_ctx.stringValue("GetApplicationResponse.Data.Error"));

		List<Item> priceList = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationResponse.Data.PriceList.Length"); i++) {
			Item item = new Item();
			item.setResourceCode(_ctx.stringValue("GetApplicationResponse.Data.PriceList["+ i +"].ResourceCode"));
			item.setInstanceName(_ctx.stringValue("GetApplicationResponse.Data.PriceList["+ i +"].InstanceName"));
			item.setOriginalPrice(_ctx.floatValue("GetApplicationResponse.Data.PriceList["+ i +"].OriginalPrice"));
			item.setOnePrice(_ctx.floatValue("GetApplicationResponse.Data.PriceList["+ i +"].OnePrice"));
			item.setPeriod(_ctx.floatValue("GetApplicationResponse.Data.PriceList["+ i +"].Period"));
			item.setCount(_ctx.longValue("GetApplicationResponse.Data.PriceList["+ i +"].Count"));
			item.setPriceUnit(_ctx.stringValue("GetApplicationResponse.Data.PriceList["+ i +"].PriceUnit"));
			item.setPrice(_ctx.floatValue("GetApplicationResponse.Data.PriceList["+ i +"].Price"));
			item.setChargeType(_ctx.stringValue("GetApplicationResponse.Data.PriceList["+ i +"].ChargeType"));
			item.setRegion(_ctx.stringValue("GetApplicationResponse.Data.PriceList["+ i +"].Region"));
			item.setSpecification(_ctx.stringValue("GetApplicationResponse.Data.PriceList["+ i +"].Specification"));
			item.setLifecycle(_ctx.stringValue("GetApplicationResponse.Data.PriceList["+ i +"].Lifecycle"));
			item.setRemark(_ctx.stringValue("GetApplicationResponse.Data.PriceList["+ i +"].Remark"));

			priceList.add(item);
		}
		data.setPriceList(priceList);

		List<Item1> checklist = new ArrayList<Item1>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationResponse.Data.Checklist.Length"); i++) {
			Item1 item1 = new Item1();
			item1.setResourceCode(_ctx.stringValue("GetApplicationResponse.Data.Checklist["+ i +"].ResourceCode"));
			item1.setResourceName(_ctx.stringValue("GetApplicationResponse.Data.Checklist["+ i +"].ResourceName"));
			item1.setRegion(_ctx.stringValue("GetApplicationResponse.Data.Checklist["+ i +"].Region"));
			item1.setResult(_ctx.stringValue("GetApplicationResponse.Data.Checklist["+ i +"].Result"));
			item1.setRemark(_ctx.stringValue("GetApplicationResponse.Data.Checklist["+ i +"].Remark"));
			item1.setSpecification(_ctx.stringValue("GetApplicationResponse.Data.Checklist["+ i +"].Specification"));
			item1.setLifecycle(_ctx.stringValue("GetApplicationResponse.Data.Checklist["+ i +"].Lifecycle"));

			checklist.add(item1);
		}
		data.setChecklist(checklist);

		List<Item2> resourceList = new ArrayList<Item2>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationResponse.Data.ResourceList.Length"); i++) {
			Item2 item2 = new Item2();
			item2.setStatus(_ctx.stringValue("GetApplicationResponse.Data.ResourceList["+ i +"].Status"));
			item2.setResourceCode(_ctx.stringValue("GetApplicationResponse.Data.ResourceList["+ i +"].ResourceCode"));
			item2.setResourceName(_ctx.stringValue("GetApplicationResponse.Data.ResourceList["+ i +"].ResourceName"));
			item2.setResourceId(_ctx.stringValue("GetApplicationResponse.Data.ResourceList["+ i +"].ResourceId"));
			item2.setChargeType(_ctx.stringValue("GetApplicationResponse.Data.ResourceList["+ i +"].ChargeType"));
			item2.setResourceType(_ctx.stringValue("GetApplicationResponse.Data.ResourceList["+ i +"].ResourceType"));
			item2.setRemark(_ctx.stringValue("GetApplicationResponse.Data.ResourceList["+ i +"].Remark"));
			item2.setLifecycle(_ctx.stringValue("GetApplicationResponse.Data.ResourceList["+ i +"].Lifecycle"));

			resourceList.add(item2);
		}
		data.setResourceList(resourceList);
		getApplicationResponse.setData(data);
	 
	 	return getApplicationResponse;
	}
}