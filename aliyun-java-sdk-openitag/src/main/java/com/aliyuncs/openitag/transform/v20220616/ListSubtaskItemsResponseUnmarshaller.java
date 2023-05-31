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

package com.aliyuncs.openitag.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openitag.model.v20220616.ListSubtaskItemsResponse;
import com.aliyuncs.openitag.model.v20220616.ListSubtaskItemsResponse.ItemsItem;
import com.aliyuncs.openitag.model.v20220616.ListSubtaskItemsResponse.ItemsItem.AnnotationsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSubtaskItemsResponseUnmarshaller {

	public static ListSubtaskItemsResponse unmarshall(ListSubtaskItemsResponse listSubtaskItemsResponse, UnmarshallerContext _ctx) {
		
		listSubtaskItemsResponse.setRequestId(_ctx.stringValue("ListSubtaskItemsResponse.RequestId"));
		listSubtaskItemsResponse.setCode(_ctx.integerValue("ListSubtaskItemsResponse.Code"));
		listSubtaskItemsResponse.setMessage(_ctx.stringValue("ListSubtaskItemsResponse.Message"));
		listSubtaskItemsResponse.setDetails(_ctx.stringValue("ListSubtaskItemsResponse.Details"));
		listSubtaskItemsResponse.setSuccess(_ctx.booleanValue("ListSubtaskItemsResponse.Success"));
		listSubtaskItemsResponse.setPageNumber(_ctx.integerValue("ListSubtaskItemsResponse.PageNumber"));
		listSubtaskItemsResponse.setPageSize(_ctx.integerValue("ListSubtaskItemsResponse.PageSize"));
		listSubtaskItemsResponse.setTotalPage(_ctx.integerValue("ListSubtaskItemsResponse.TotalPage"));
		listSubtaskItemsResponse.setTotalCount(_ctx.integerValue("ListSubtaskItemsResponse.TotalCount"));
		listSubtaskItemsResponse.setErrorCode(_ctx.stringValue("ListSubtaskItemsResponse.ErrorCode"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSubtaskItemsResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setItemId(_ctx.longValue("ListSubtaskItemsResponse.Items["+ i +"].ItemId"));
			itemsItem.setDataSource(_ctx.mapValue("ListSubtaskItemsResponse.Items["+ i +"].DataSource"));

			List<AnnotationsItem> annotations = new ArrayList<AnnotationsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListSubtaskItemsResponse.Items["+ i +"].Annotations.Length"); j++) {
				AnnotationsItem annotationsItem = new AnnotationsItem();
				annotationsItem.setFeedbackRemark(_ctx.stringValue("ListSubtaskItemsResponse.Items["+ i +"].Annotations["+ j +"].FeedbackRemark"));
				annotationsItem.setFeedbackFlag(_ctx.booleanValue("ListSubtaskItemsResponse.Items["+ i +"].Annotations["+ j +"].FeedbackFlag"));
				annotationsItem.setDataId(_ctx.stringValue("ListSubtaskItemsResponse.Items["+ i +"].Annotations["+ j +"].DataId"));
				annotationsItem.setState(_ctx.stringValue("ListSubtaskItemsResponse.Items["+ i +"].Annotations["+ j +"].State"));
				annotationsItem.setMine(_ctx.longValue("ListSubtaskItemsResponse.Items["+ i +"].Annotations["+ j +"].Mine"));
				annotationsItem.setRejectFlag(_ctx.booleanValue("ListSubtaskItemsResponse.Items["+ i +"].Annotations["+ j +"].RejectFlag"));
				annotationsItem.setFixedFlag(_ctx.booleanValue("ListSubtaskItemsResponse.Items["+ i +"].Annotations["+ j +"].FixedFlag"));
				annotationsItem.setAbandonFlag(_ctx.booleanValue("ListSubtaskItemsResponse.Items["+ i +"].Annotations["+ j +"].AbandonFlag"));
				annotationsItem.setAbandonRemark(_ctx.stringValue("ListSubtaskItemsResponse.Items["+ i +"].Annotations["+ j +"].AbandonRemark"));
				annotationsItem.setWeight(_ctx.longValue("ListSubtaskItemsResponse.Items["+ i +"].Annotations["+ j +"].Weight"));

				annotations.add(annotationsItem);
			}
			itemsItem.setAnnotations(annotations);

			items.add(itemsItem);
		}
		listSubtaskItemsResponse.setItems(items);
	 
	 	return listSubtaskItemsResponse;
	}
}