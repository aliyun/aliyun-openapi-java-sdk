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

package com.aliyuncs.reid_cloud.transform.v20201029;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid_cloud.model.v20201029.ListSpecialPersonnelByImageResponse;
import com.aliyuncs.reid_cloud.model.v20201029.ListSpecialPersonnelByImageResponse.ListPersonResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSpecialPersonnelByImageResponseUnmarshaller {

	public static ListSpecialPersonnelByImageResponse unmarshall(ListSpecialPersonnelByImageResponse listSpecialPersonnelByImageResponse, UnmarshallerContext _ctx) {
		
		listSpecialPersonnelByImageResponse.setRequestId(_ctx.stringValue("ListSpecialPersonnelByImageResponse.RequestId"));
		listSpecialPersonnelByImageResponse.setMessage(_ctx.stringValue("ListSpecialPersonnelByImageResponse.Message"));
		listSpecialPersonnelByImageResponse.setDynamicCode(_ctx.stringValue("ListSpecialPersonnelByImageResponse.DynamicCode"));
		listSpecialPersonnelByImageResponse.setDynamicMessage(_ctx.stringValue("ListSpecialPersonnelByImageResponse.DynamicMessage"));
		listSpecialPersonnelByImageResponse.setErrorCode(_ctx.stringValue("ListSpecialPersonnelByImageResponse.ErrorCode"));
		listSpecialPersonnelByImageResponse.setErrorMessage(_ctx.stringValue("ListSpecialPersonnelByImageResponse.ErrorMessage"));
		listSpecialPersonnelByImageResponse.setCode(_ctx.stringValue("ListSpecialPersonnelByImageResponse.Code"));
		listSpecialPersonnelByImageResponse.setSuccess(_ctx.booleanValue("ListSpecialPersonnelByImageResponse.Success"));

		List<ListPersonResultItem> listPersonResultItems = new ArrayList<ListPersonResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSpecialPersonnelByImageResponse.ListPersonResultItems.Length"); i++) {
			ListPersonResultItem listPersonResultItem = new ListPersonResultItem();
			listPersonResultItem.setScore(_ctx.floatValue("ListSpecialPersonnelByImageResponse.ListPersonResultItems["+ i +"].Score"));
			listPersonResultItem.setUkId(_ctx.longValue("ListSpecialPersonnelByImageResponse.ListPersonResultItems["+ i +"].UkId"));

			listPersonResultItems.add(listPersonResultItem);
		}
		listSpecialPersonnelByImageResponse.setListPersonResultItems(listPersonResultItems);
	 
	 	return listSpecialPersonnelByImageResponse;
	}
}