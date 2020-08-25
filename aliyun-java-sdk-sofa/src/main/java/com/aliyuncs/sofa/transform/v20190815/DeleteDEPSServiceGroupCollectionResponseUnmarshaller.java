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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.DeleteDEPSServiceGroupCollectionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDEPSServiceGroupCollectionResponseUnmarshaller {

	public static DeleteDEPSServiceGroupCollectionResponse unmarshall(DeleteDEPSServiceGroupCollectionResponse deleteDEPSServiceGroupCollectionResponse, UnmarshallerContext _ctx) {
		
		deleteDEPSServiceGroupCollectionResponse.setRequestId(_ctx.stringValue("DeleteDEPSServiceGroupCollectionResponse.RequestId"));
		deleteDEPSServiceGroupCollectionResponse.setResultCode(_ctx.stringValue("DeleteDEPSServiceGroupCollectionResponse.ResultCode"));
		deleteDEPSServiceGroupCollectionResponse.setResultMessage(_ctx.stringValue("DeleteDEPSServiceGroupCollectionResponse.ResultMessage"));

		List<String> collections = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteDEPSServiceGroupCollectionResponse.Collections.Length"); i++) {
			collections.add(_ctx.stringValue("DeleteDEPSServiceGroupCollectionResponse.Collections["+ i +"]"));
		}
		deleteDEPSServiceGroupCollectionResponse.setCollections(collections);
	 
	 	return deleteDEPSServiceGroupCollectionResponse;
	}
}