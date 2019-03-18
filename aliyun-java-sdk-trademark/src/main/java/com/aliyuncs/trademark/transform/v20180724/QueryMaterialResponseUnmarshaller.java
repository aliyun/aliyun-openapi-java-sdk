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

import com.aliyuncs.trademark.model.v20180724.QueryMaterialResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMaterialResponseUnmarshaller {

	public static QueryMaterialResponse unmarshall(QueryMaterialResponse queryMaterialResponse, UnmarshallerContext context) {
		
		queryMaterialResponse.setRequestId(context.stringValue("QueryMaterialResponse.RequestId"));
		queryMaterialResponse.setType(context.integerValue("QueryMaterialResponse.Type"));
		queryMaterialResponse.setRegion(context.integerValue("QueryMaterialResponse.Region"));
		queryMaterialResponse.setContactName(context.stringValue("QueryMaterialResponse.ContactName"));
		queryMaterialResponse.setContactNumber(context.stringValue("QueryMaterialResponse.ContactNumber"));
		queryMaterialResponse.setContactEmail(context.stringValue("QueryMaterialResponse.ContactEmail"));
		queryMaterialResponse.setContactAddress(context.stringValue("QueryMaterialResponse.ContactAddress"));
		queryMaterialResponse.setContactZipcode(context.stringValue("QueryMaterialResponse.ContactZipcode"));
		queryMaterialResponse.setStatus(context.integerValue("QueryMaterialResponse.Status"));
		queryMaterialResponse.setLoaUrl(context.stringValue("QueryMaterialResponse.LoaUrl"));
		queryMaterialResponse.setName(context.stringValue("QueryMaterialResponse.Name"));
		queryMaterialResponse.setCardNumber(context.stringValue("QueryMaterialResponse.CardNumber"));
		queryMaterialResponse.setExpirationDate(context.longValue("QueryMaterialResponse.ExpirationDate"));
		queryMaterialResponse.setProvince(context.stringValue("QueryMaterialResponse.Province"));
		queryMaterialResponse.setCity(context.stringValue("QueryMaterialResponse.City"));
		queryMaterialResponse.setTown(context.stringValue("QueryMaterialResponse.Town"));
		queryMaterialResponse.setAddress(context.stringValue("QueryMaterialResponse.Address"));
		queryMaterialResponse.setEName(context.stringValue("QueryMaterialResponse.EName"));
		queryMaterialResponse.setEAddress(context.stringValue("QueryMaterialResponse.EAddress"));
		queryMaterialResponse.setLoaStatus(context.integerValue("QueryMaterialResponse.LoaStatus"));
		queryMaterialResponse.setIdCardUrl(context.stringValue("QueryMaterialResponse.IdCardUrl"));
		queryMaterialResponse.setBusinessLicenceUrl(context.stringValue("QueryMaterialResponse.BusinessLicenceUrl"));
		queryMaterialResponse.setPassportUrl(context.stringValue("QueryMaterialResponse.PassportUrl"));
		queryMaterialResponse.setId(context.longValue("QueryMaterialResponse.Id"));
		queryMaterialResponse.setLegalNoticeUrl(context.stringValue("QueryMaterialResponse.LegalNoticeUrl"));
		queryMaterialResponse.setNote(context.stringValue("QueryMaterialResponse.Note"));
		queryMaterialResponse.setCountry(context.stringValue("QueryMaterialResponse.Country"));
	 
	 	return queryMaterialResponse;
	}
}