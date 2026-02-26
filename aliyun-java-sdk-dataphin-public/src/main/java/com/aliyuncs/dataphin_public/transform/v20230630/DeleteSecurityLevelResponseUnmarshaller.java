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

import com.aliyuncs.dataphin_public.model.v20230630.DeleteSecurityLevelResponse;
import com.aliyuncs.dataphin_public.model.v20230630.DeleteSecurityLevelResponse.DeleteResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSecurityLevelResponseUnmarshaller {

	public static DeleteSecurityLevelResponse unmarshall(DeleteSecurityLevelResponse deleteSecurityLevelResponse, UnmarshallerContext _ctx) {
		
		deleteSecurityLevelResponse.setRequestId(_ctx.stringValue("DeleteSecurityLevelResponse.RequestId"));
		deleteSecurityLevelResponse.setSuccess(_ctx.booleanValue("DeleteSecurityLevelResponse.Success"));
		deleteSecurityLevelResponse.setHttpStatusCode(_ctx.integerValue("DeleteSecurityLevelResponse.HttpStatusCode"));
		deleteSecurityLevelResponse.setCode(_ctx.stringValue("DeleteSecurityLevelResponse.Code"));
		deleteSecurityLevelResponse.setMessage(_ctx.stringValue("DeleteSecurityLevelResponse.Message"));

		DeleteResult deleteResult = new DeleteResult();
		deleteResult.setSuccess(_ctx.booleanValue("DeleteSecurityLevelResponse.DeleteResult.Success"));
		deleteResult.setErrorCode(_ctx.stringValue("DeleteSecurityLevelResponse.DeleteResult.ErrorCode"));

		List<Long> relatedClassifyIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("DeleteSecurityLevelResponse.DeleteResult.RelatedClassifyIdList.Length"); i++) {
			relatedClassifyIdList.add(_ctx.longValue("DeleteSecurityLevelResponse.DeleteResult.RelatedClassifyIdList["+ i +"]"));
		}
		deleteResult.setRelatedClassifyIdList(relatedClassifyIdList);
		deleteSecurityLevelResponse.setDeleteResult(deleteResult);
	 
	 	return deleteSecurityLevelResponse;
	}
}