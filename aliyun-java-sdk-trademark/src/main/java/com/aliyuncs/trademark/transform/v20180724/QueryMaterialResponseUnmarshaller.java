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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QueryMaterialResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMaterialResponseUnmarshaller {

	public static QueryMaterialResponse unmarshall(QueryMaterialResponse queryMaterialResponse, UnmarshallerContext _ctx) {
		
		queryMaterialResponse.setRequestId(_ctx.stringValue("QueryMaterialResponse.RequestId"));
		queryMaterialResponse.setType(_ctx.integerValue("QueryMaterialResponse.Type"));
		queryMaterialResponse.setRegion(_ctx.integerValue("QueryMaterialResponse.Region"));
		queryMaterialResponse.setContactName(_ctx.stringValue("QueryMaterialResponse.ContactName"));
		queryMaterialResponse.setContactNumber(_ctx.stringValue("QueryMaterialResponse.ContactNumber"));
		queryMaterialResponse.setContactEmail(_ctx.stringValue("QueryMaterialResponse.ContactEmail"));
		queryMaterialResponse.setContactAddress(_ctx.stringValue("QueryMaterialResponse.ContactAddress"));
		queryMaterialResponse.setContactZipcode(_ctx.stringValue("QueryMaterialResponse.ContactZipcode"));
		queryMaterialResponse.setStatus(_ctx.integerValue("QueryMaterialResponse.Status"));
		queryMaterialResponse.setLoaUrl(_ctx.stringValue("QueryMaterialResponse.LoaUrl"));
		queryMaterialResponse.setName(_ctx.stringValue("QueryMaterialResponse.Name"));
		queryMaterialResponse.setCardNumber(_ctx.stringValue("QueryMaterialResponse.CardNumber"));
		queryMaterialResponse.setExpirationDate(_ctx.longValue("QueryMaterialResponse.ExpirationDate"));
		queryMaterialResponse.setProvince(_ctx.stringValue("QueryMaterialResponse.Province"));
		queryMaterialResponse.setCity(_ctx.stringValue("QueryMaterialResponse.City"));
		queryMaterialResponse.setTown(_ctx.stringValue("QueryMaterialResponse.Town"));
		queryMaterialResponse.setAddress(_ctx.stringValue("QueryMaterialResponse.Address"));
		queryMaterialResponse.setEName(_ctx.stringValue("QueryMaterialResponse.EName"));
		queryMaterialResponse.setEAddress(_ctx.stringValue("QueryMaterialResponse.EAddress"));
		queryMaterialResponse.setLoaStatus(_ctx.integerValue("QueryMaterialResponse.LoaStatus"));
		queryMaterialResponse.setIdCardUrl(_ctx.stringValue("QueryMaterialResponse.IdCardUrl"));
		queryMaterialResponse.setBusinessLicenceUrl(_ctx.stringValue("QueryMaterialResponse.BusinessLicenceUrl"));
		queryMaterialResponse.setPassportUrl(_ctx.stringValue("QueryMaterialResponse.PassportUrl"));
		queryMaterialResponse.setId(_ctx.longValue("QueryMaterialResponse.Id"));
		queryMaterialResponse.setLegalNoticeUrl(_ctx.stringValue("QueryMaterialResponse.LegalNoticeUrl"));
		queryMaterialResponse.setNote(_ctx.stringValue("QueryMaterialResponse.Note"));
		queryMaterialResponse.setCountry(_ctx.stringValue("QueryMaterialResponse.Country"));
		queryMaterialResponse.setReviewApplicationFile(_ctx.stringValue("QueryMaterialResponse.ReviewApplicationFile"));

		List<String> reviewAdditionalFiles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryMaterialResponse.ReviewAdditionalFiles.Length"); i++) {
			reviewAdditionalFiles.add(_ctx.stringValue("QueryMaterialResponse.ReviewAdditionalFiles["+ i +"]"));
		}
		queryMaterialResponse.setReviewAdditionalFiles(reviewAdditionalFiles);
	 
	 	return queryMaterialResponse;
	}
}