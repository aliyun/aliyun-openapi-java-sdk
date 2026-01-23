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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.DeleteSecurityClassifyCatalogResponse;
import com.aliyuncs.dataphin_public.model.v20230630.DeleteSecurityClassifyCatalogResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSecurityClassifyCatalogResponseUnmarshaller {

	public static DeleteSecurityClassifyCatalogResponse unmarshall(DeleteSecurityClassifyCatalogResponse deleteSecurityClassifyCatalogResponse, UnmarshallerContext _ctx) {
		
		deleteSecurityClassifyCatalogResponse.setRequestId(_ctx.stringValue("DeleteSecurityClassifyCatalogResponse.RequestId"));
		deleteSecurityClassifyCatalogResponse.setSuccess(_ctx.booleanValue("DeleteSecurityClassifyCatalogResponse.Success"));
		deleteSecurityClassifyCatalogResponse.setHttpStatusCode(_ctx.integerValue("DeleteSecurityClassifyCatalogResponse.HttpStatusCode"));
		deleteSecurityClassifyCatalogResponse.setCode(_ctx.stringValue("DeleteSecurityClassifyCatalogResponse.Code"));
		deleteSecurityClassifyCatalogResponse.setMessage(_ctx.stringValue("DeleteSecurityClassifyCatalogResponse.Message"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("DeleteSecurityClassifyCatalogResponse.Data.Success"));

		List<String> childCatalogFullPathList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteSecurityClassifyCatalogResponse.Data.ChildCatalogFullPathList.Length"); i++) {
			childCatalogFullPathList.add(_ctx.stringValue("DeleteSecurityClassifyCatalogResponse.Data.ChildCatalogFullPathList["+ i +"]"));
		}
		data.setChildCatalogFullPathList(childCatalogFullPathList);

		List<Long> classifyIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("DeleteSecurityClassifyCatalogResponse.Data.ClassifyIdList.Length"); i++) {
			classifyIdList.add(_ctx.longValue("DeleteSecurityClassifyCatalogResponse.Data.ClassifyIdList["+ i +"]"));
		}
		data.setClassifyIdList(classifyIdList);
		deleteSecurityClassifyCatalogResponse.setData(data);
	 
	 	return deleteSecurityClassifyCatalogResponse;
	}
}