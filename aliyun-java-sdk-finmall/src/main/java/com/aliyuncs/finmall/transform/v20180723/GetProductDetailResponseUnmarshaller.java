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

package com.aliyuncs.finmall.transform.v20180723;

import com.aliyuncs.finmall.model.v20180723.GetProductDetailResponse;
import com.aliyuncs.finmall.model.v20180723.GetProductDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProductDetailResponseUnmarshaller {

	public static GetProductDetailResponse unmarshall(GetProductDetailResponse getProductDetailResponse, UnmarshallerContext context) {
		
		getProductDetailResponse.setRequestId(context.stringValue("GetProductDetailResponse.RequestId"));
		getProductDetailResponse.setMessage(context.stringValue("GetProductDetailResponse.Message"));
		getProductDetailResponse.setCode(context.stringValue("GetProductDetailResponse.Code"));

		Data data = new Data();
		data.setProductId(context.stringValue("GetProductDetailResponse.Data.ProductId"));
		data.setProductName(context.stringValue("GetProductDetailResponse.Data.ProductName"));
		data.setLendingOrganizations(context.stringValue("GetProductDetailResponse.Data.LendingOrganizations"));
		data.setTerms(context.stringValue("GetProductDetailResponse.Data.Terms"));
		data.setDailyRate(context.stringValue("GetProductDetailResponse.Data.DailyRate"));
		data.setYearRate(context.stringValue("GetProductDetailResponse.Data.YearRate"));
		data.setFoundPartyName(context.stringValue("GetProductDetailResponse.Data.FoundPartyName"));
		data.setFoundPartyId(context.stringValue("GetProductDetailResponse.Data.FoundPartyId"));
		data.setInterestRate(context.stringValue("GetProductDetailResponse.Data.InterestRate"));
		data.setPrincipalLimit(context.stringValue("GetProductDetailResponse.Data.PrincipalLimit"));
		data.setFinancialInfo(context.stringValue("GetProductDetailResponse.Data.FinancialInfo"));
		data.setFineAmount(context.stringValue("GetProductDetailResponse.Data.FineAmount"));
		data.setComment(context.stringValue("GetProductDetailResponse.Data.Comment"));
		getProductDetailResponse.setData(data);
	 
	 	return getProductDetailResponse;
	}
}