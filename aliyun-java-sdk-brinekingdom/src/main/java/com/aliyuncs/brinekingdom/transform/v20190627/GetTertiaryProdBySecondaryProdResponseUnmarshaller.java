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

package com.aliyuncs.brinekingdom.transform.v20190627;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.brinekingdom.model.v20190627.GetTertiaryProdBySecondaryProdResponse;
import com.aliyuncs.brinekingdom.model.v20190627.GetTertiaryProdBySecondaryProdResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTertiaryProdBySecondaryProdResponseUnmarshaller {

	public static GetTertiaryProdBySecondaryProdResponse unmarshall(GetTertiaryProdBySecondaryProdResponse getTertiaryProdBySecondaryProdResponse, UnmarshallerContext _ctx) {
		
		getTertiaryProdBySecondaryProdResponse.setRequestId(_ctx.stringValue("GetTertiaryProdBySecondaryProdResponse.RequestId"));
		getTertiaryProdBySecondaryProdResponse.set_Class(_ctx.stringValue("GetTertiaryProdBySecondaryProdResponse.Class"));
		getTertiaryProdBySecondaryProdResponse.setErrorMessage(_ctx.stringValue("GetTertiaryProdBySecondaryProdResponse.ErrorMessage"));
		getTertiaryProdBySecondaryProdResponse.setSuccess(_ctx.booleanValue("GetTertiaryProdBySecondaryProdResponse.Success"));
		getTertiaryProdBySecondaryProdResponse.setResultCode(_ctx.stringValue("GetTertiaryProdBySecondaryProdResponse.ResultCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTertiaryProdBySecondaryProdResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAoneId(_ctx.stringValue("GetTertiaryProdBySecondaryProdResponse.Result["+ i +"].AoneId"));
			resultItem.setAoneName(_ctx.stringValue("GetTertiaryProdBySecondaryProdResponse.Result["+ i +"].AoneName"));
			resultItem.set_Class(_ctx.stringValue("GetTertiaryProdBySecondaryProdResponse.Result["+ i +"].Class"));
			resultItem.setProductClass(_ctx.stringValue("GetTertiaryProdBySecondaryProdResponse.Result["+ i +"].ProductClass"));
			resultItem.setProductClassCN(_ctx.stringValue("GetTertiaryProdBySecondaryProdResponse.Result["+ i +"].ProductClassCN"));
			resultItem.setProductCode(_ctx.stringValue("GetTertiaryProdBySecondaryProdResponse.Result["+ i +"].ProductCode"));
			resultItem.setProductEnName(_ctx.stringValue("GetTertiaryProdBySecondaryProdResponse.Result["+ i +"].ProductEnName"));
			resultItem.setProductLineCN(_ctx.stringValue("GetTertiaryProdBySecondaryProdResponse.Result["+ i +"].ProductLineCN"));
			resultItem.setProductLineEN(_ctx.stringValue("GetTertiaryProdBySecondaryProdResponse.Result["+ i +"].ProductLineEN"));
			resultItem.setProductName(_ctx.stringValue("GetTertiaryProdBySecondaryProdResponse.Result["+ i +"].ProductName"));

			result.add(resultItem);
		}
		getTertiaryProdBySecondaryProdResponse.setResult(result);
	 
	 	return getTertiaryProdBySecondaryProdResponse;
	}
}