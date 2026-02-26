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

import com.aliyuncs.openitag.model.v20220616.GetSubtaskItemResponse;
import com.aliyuncs.openitag.model.v20220616.GetSubtaskItemResponse.Item;
import com.aliyuncs.openitag.model.v20220616.GetSubtaskItemResponse.Item.AnnotationsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSubtaskItemResponseUnmarshaller {

	public static GetSubtaskItemResponse unmarshall(GetSubtaskItemResponse getSubtaskItemResponse, UnmarshallerContext _ctx) {
		
		getSubtaskItemResponse.setRequestId(_ctx.stringValue("GetSubtaskItemResponse.RequestId"));
		getSubtaskItemResponse.setCode(_ctx.integerValue("GetSubtaskItemResponse.Code"));
		getSubtaskItemResponse.setMessage(_ctx.stringValue("GetSubtaskItemResponse.Message"));
		getSubtaskItemResponse.setDetails(_ctx.stringValue("GetSubtaskItemResponse.Details"));
		getSubtaskItemResponse.setSuccess(_ctx.booleanValue("GetSubtaskItemResponse.Success"));
		getSubtaskItemResponse.setErrorCode(_ctx.stringValue("GetSubtaskItemResponse.ErrorCode"));

		Item item = new Item();
		item.setItemId(_ctx.longValue("GetSubtaskItemResponse.Item.ItemId"));
		item.setDataSource(_ctx.mapValue("GetSubtaskItemResponse.Item.DataSource"));

		List<AnnotationsItem> annotations = new ArrayList<AnnotationsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSubtaskItemResponse.Item.Annotations.Length"); i++) {
			AnnotationsItem annotationsItem = new AnnotationsItem();
			annotationsItem.setFeedbackRemark(_ctx.stringValue("GetSubtaskItemResponse.Item.Annotations["+ i +"].FeedbackRemark"));
			annotationsItem.setFeedbackFlag(_ctx.booleanValue("GetSubtaskItemResponse.Item.Annotations["+ i +"].FeedbackFlag"));
			annotationsItem.setDataId(_ctx.stringValue("GetSubtaskItemResponse.Item.Annotations["+ i +"].DataId"));
			annotationsItem.setState(_ctx.stringValue("GetSubtaskItemResponse.Item.Annotations["+ i +"].State"));
			annotationsItem.setMine(_ctx.longValue("GetSubtaskItemResponse.Item.Annotations["+ i +"].Mine"));
			annotationsItem.setRejectFlag(_ctx.booleanValue("GetSubtaskItemResponse.Item.Annotations["+ i +"].RejectFlag"));
			annotationsItem.setFixedFlag(_ctx.booleanValue("GetSubtaskItemResponse.Item.Annotations["+ i +"].FixedFlag"));
			annotationsItem.setAbandonFlag(_ctx.booleanValue("GetSubtaskItemResponse.Item.Annotations["+ i +"].AbandonFlag"));
			annotationsItem.setAbandonRemark(_ctx.stringValue("GetSubtaskItemResponse.Item.Annotations["+ i +"].AbandonRemark"));
			annotationsItem.setWeight(_ctx.longValue("GetSubtaskItemResponse.Item.Annotations["+ i +"].Weight"));

			annotations.add(annotationsItem);
		}
		item.setAnnotations(annotations);
		getSubtaskItemResponse.setItem(item);
	 
	 	return getSubtaskItemResponse;
	}
}