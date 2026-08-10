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

import com.aliyuncs.dataphin_public.model.v20230630.ListSecurityClassifyResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListSecurityClassifyResponse.ClassifyListResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListSecurityClassifyResponse.ClassifyListResult.ClassifyInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSecurityClassifyResponseUnmarshaller {

	public static ListSecurityClassifyResponse unmarshall(ListSecurityClassifyResponse listSecurityClassifyResponse, UnmarshallerContext _ctx) {
		
		listSecurityClassifyResponse.setRequestId(_ctx.stringValue("ListSecurityClassifyResponse.RequestId"));
		listSecurityClassifyResponse.setMessage(_ctx.stringValue("ListSecurityClassifyResponse.Message"));
		listSecurityClassifyResponse.setHttpStatusCode(_ctx.integerValue("ListSecurityClassifyResponse.HttpStatusCode"));
		listSecurityClassifyResponse.setCode(_ctx.stringValue("ListSecurityClassifyResponse.Code"));
		listSecurityClassifyResponse.setSuccess(_ctx.booleanValue("ListSecurityClassifyResponse.Success"));

		ClassifyListResult classifyListResult = new ClassifyListResult();
		classifyListResult.setTotalCount(_ctx.integerValue("ListSecurityClassifyResponse.ClassifyListResult.TotalCount"));

		List<ClassifyInfo> classifyList = new ArrayList<ClassifyInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListSecurityClassifyResponse.ClassifyListResult.ClassifyList.Length"); i++) {
			ClassifyInfo classifyInfo = new ClassifyInfo();
			classifyInfo.setStatus(_ctx.stringValue("ListSecurityClassifyResponse.ClassifyListResult.ClassifyList["+ i +"].Status"));
			classifyInfo.setCatalogPath(_ctx.stringValue("ListSecurityClassifyResponse.ClassifyListResult.ClassifyList["+ i +"].CatalogPath"));
			classifyInfo.setIsBindDesensitizeRule(_ctx.booleanValue("ListSecurityClassifyResponse.ClassifyListResult.ClassifyList["+ i +"].IsBindDesensitizeRule"));
			classifyInfo.setDescription(_ctx.stringValue("ListSecurityClassifyResponse.ClassifyListResult.ClassifyList["+ i +"].Description"));
			classifyInfo.setPriority(_ctx.integerValue("ListSecurityClassifyResponse.ClassifyListResult.ClassifyList["+ i +"].Priority"));
			classifyInfo.setLevelName(_ctx.stringValue("ListSecurityClassifyResponse.ClassifyListResult.ClassifyList["+ i +"].LevelName"));
			classifyInfo.setShortName(_ctx.stringValue("ListSecurityClassifyResponse.ClassifyListResult.ClassifyList["+ i +"].ShortName"));
			classifyInfo.setId(_ctx.longValue("ListSecurityClassifyResponse.ClassifyListResult.ClassifyList["+ i +"].Id"));
			classifyInfo.setLevelId(_ctx.longValue("ListSecurityClassifyResponse.ClassifyListResult.ClassifyList["+ i +"].LevelId"));
			classifyInfo.setEffectiveFieldCount(_ctx.integerValue("ListSecurityClassifyResponse.ClassifyListResult.ClassifyList["+ i +"].EffectiveFieldCount"));
			classifyInfo.setName(_ctx.stringValue("ListSecurityClassifyResponse.ClassifyListResult.ClassifyList["+ i +"].Name"));

			classifyList.add(classifyInfo);
		}
		classifyListResult.setClassifyList(classifyList);
		listSecurityClassifyResponse.setClassifyListResult(classifyListResult);
	 
	 	return listSecurityClassifyResponse;
	}
}