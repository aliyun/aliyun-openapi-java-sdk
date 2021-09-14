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

package com.aliyuncs.emas_dmp.transform.v20210402;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emas_dmp.model.v20210402.ListTargetAudienceResponse;
import com.aliyuncs.emas_dmp.model.v20210402.ListTargetAudienceResponse.Data;
import com.aliyuncs.emas_dmp.model.v20210402.ListTargetAudienceResponse.Data.Crowds;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTargetAudienceResponseUnmarshaller {

	public static ListTargetAudienceResponse unmarshall(ListTargetAudienceResponse listTargetAudienceResponse, UnmarshallerContext _ctx) {
		
		listTargetAudienceResponse.setRequestId(_ctx.stringValue("ListTargetAudienceResponse.RequestId"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("ListTargetAudienceResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("ListTargetAudienceResponse.Data.PageSize"));
		data.setTotalPages(_ctx.integerValue("ListTargetAudienceResponse.Data.TotalPages"));
		data.setTotalElements(_ctx.integerValue("ListTargetAudienceResponse.Data.TotalElements"));

		List<Crowds> taList = new ArrayList<Crowds>();
		for (int i = 0; i < _ctx.lengthValue("ListTargetAudienceResponse.Data.TaList.Length"); i++) {
			Crowds crowds = new Crowds();
			crowds.setTaId(_ctx.stringValue("ListTargetAudienceResponse.Data.TaList["+ i +"].TaId"));
			crowds.setName(_ctx.stringValue("ListTargetAudienceResponse.Data.TaList["+ i +"].Name"));
			crowds.setCreatedTime(_ctx.stringValue("ListTargetAudienceResponse.Data.TaList["+ i +"].CreatedTime"));
			crowds.setTotalNumber(_ctx.longValue("ListTargetAudienceResponse.Data.TaList["+ i +"].TotalNumber"));
			crowds.setSource(_ctx.stringValue("ListTargetAudienceResponse.Data.TaList["+ i +"].Source"));
			crowds.setTaBaseType(_ctx.stringValue("ListTargetAudienceResponse.Data.TaList["+ i +"].TaBaseType"));
			crowds.setTaType(_ctx.stringValue("ListTargetAudienceResponse.Data.TaList["+ i +"].TaType"));
			crowds.setTenantId(_ctx.stringValue("ListTargetAudienceResponse.Data.TaList["+ i +"].TenantId"));
			crowds.setTenantName(_ctx.stringValue("ListTargetAudienceResponse.Data.TaList["+ i +"].TenantName"));
			crowds.setAccountId(_ctx.stringValue("ListTargetAudienceResponse.Data.TaList["+ i +"].AccountId"));
			crowds.setAccountName(_ctx.stringValue("ListTargetAudienceResponse.Data.TaList["+ i +"].AccountName"));
			crowds.setStatus(_ctx.stringValue("ListTargetAudienceResponse.Data.TaList["+ i +"].Status"));
			crowds.setUploadFileNum(_ctx.integerValue("ListTargetAudienceResponse.Data.TaList["+ i +"].UploadFileNum"));
			crowds.setPushStatus(_ctx.stringValue("ListTargetAudienceResponse.Data.TaList["+ i +"].PushStatus"));
			crowds.setPushTime(_ctx.stringValue("ListTargetAudienceResponse.Data.TaList["+ i +"].PushTime"));
			crowds.setErrorMessage(_ctx.stringValue("ListTargetAudienceResponse.Data.TaList["+ i +"].ErrorMessage"));
			crowds.setCreateCondition(_ctx.stringValue("ListTargetAudienceResponse.Data.TaList["+ i +"].CreateCondition"));
			crowds.setBusinessScenario(_ctx.stringValue("ListTargetAudienceResponse.Data.TaList["+ i +"].BusinessScenario"));

			List<String> pushedBand = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTargetAudienceResponse.Data.TaList["+ i +"].PushedBand.Length"); j++) {
				pushedBand.add(_ctx.stringValue("ListTargetAudienceResponse.Data.TaList["+ i +"].PushedBand["+ j +"]"));
			}
			crowds.setPushedBand(pushedBand);

			taList.add(crowds);
		}
		data.setTaList(taList);
		listTargetAudienceResponse.setData(data);
	 
	 	return listTargetAudienceResponse;
	}
}