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

package com.aliyuncs.idsp.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idsp.model.v20200710.GetSubjectResponse;
import com.aliyuncs.idsp.model.v20200710.GetSubjectResponse.Data;
import com.aliyuncs.idsp.model.v20200710.GetSubjectResponse.Data.PageModel;
import com.aliyuncs.idsp.model.v20200710.GetSubjectResponse.Data.SpecialSubjectDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSubjectResponseUnmarshaller {

	public static GetSubjectResponse unmarshall(GetSubjectResponse getSubjectResponse, UnmarshallerContext _ctx) {
		
		getSubjectResponse.setRequestId(_ctx.stringValue("GetSubjectResponse.RequestId"));
		getSubjectResponse.setSuccess(_ctx.booleanValue("GetSubjectResponse.Success"));
		getSubjectResponse.setCode(_ctx.stringValue("GetSubjectResponse.Code"));
		getSubjectResponse.setMessage(_ctx.stringValue("GetSubjectResponse.Message"));

		Data data = new Data();

		PageModel pageModel = new PageModel();
		pageModel.setCurrentPage(_ctx.integerValue("GetSubjectResponse.Data.PageModel.CurrentPage"));
		pageModel.setPageSize(_ctx.integerValue("GetSubjectResponse.Data.PageModel.PageSize"));
		pageModel.setTotalCount(_ctx.longValue("GetSubjectResponse.Data.PageModel.TotalCount"));
		data.setPageModel(pageModel);

		List<SpecialSubjectDo> list = new ArrayList<SpecialSubjectDo>();
		for (int i = 0; i < _ctx.lengthValue("GetSubjectResponse.Data.List.Length"); i++) {
			SpecialSubjectDo specialSubjectDo = new SpecialSubjectDo();
			specialSubjectDo.setId(_ctx.longValue("GetSubjectResponse.Data.List["+ i +"].Id"));
			specialSubjectDo.setName(_ctx.stringValue("GetSubjectResponse.Data.List["+ i +"].Name"));
			specialSubjectDo.setPosKeywords(_ctx.stringValue("GetSubjectResponse.Data.List["+ i +"].PosKeywords"));
			specialSubjectDo.setAssKeywords(_ctx.stringValue("GetSubjectResponse.Data.List["+ i +"].AssKeywords"));
			specialSubjectDo.setExcludeKeywords(_ctx.stringValue("GetSubjectResponse.Data.List["+ i +"].ExcludeKeywords"));

			list.add(specialSubjectDo);
		}
		data.setList(list);
		getSubjectResponse.setData(data);
	 
	 	return getSubjectResponse;
	}
}