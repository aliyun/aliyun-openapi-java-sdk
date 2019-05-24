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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.QueryAddressResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryAddressResponse.DivisionAddressItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAddressResponseUnmarshaller {

	public static QueryAddressResponse unmarshall(QueryAddressResponse queryAddressResponse, UnmarshallerContext context) {
		
		queryAddressResponse.setRequestId(context.stringValue("QueryAddressResponse.RequestId"));
		queryAddressResponse.setCode(context.stringValue("QueryAddressResponse.Code"));
		queryAddressResponse.setMessage(context.stringValue("QueryAddressResponse.Message"));

		List<DivisionAddressItem> divisionAddress = new ArrayList<DivisionAddressItem>();
		for (int i = 0; i < context.lengthValue("QueryAddressResponse.DivisionAddress.Length"); i++) {
			DivisionAddressItem divisionAddressItem = new DivisionAddressItem();
			divisionAddressItem.setDivisionCode(context.longValue("QueryAddressResponse.DivisionAddress["+ i +"].DivisionCode"));
			divisionAddressItem.setDivisionName(context.stringValue("QueryAddressResponse.DivisionAddress["+ i +"].DivisionName"));
			divisionAddressItem.setDivisionLevel(context.integerValue("QueryAddressResponse.DivisionAddress["+ i +"].DivisionLevel"));
			divisionAddressItem.setParentId(context.longValue("QueryAddressResponse.DivisionAddress["+ i +"].ParentId"));

			divisionAddress.add(divisionAddressItem);
		}
		queryAddressResponse.setDivisionAddress(divisionAddress);
	 
	 	return queryAddressResponse;
	}
}