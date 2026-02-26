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

import com.aliyuncs.brinekingdom.model.v20190627.GetSecondaryProdByPrimaryProdResponse;
import com.aliyuncs.brinekingdom.model.v20190627.GetSecondaryProdByPrimaryProdResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSecondaryProdByPrimaryProdResponseUnmarshaller {

	public static GetSecondaryProdByPrimaryProdResponse unmarshall(GetSecondaryProdByPrimaryProdResponse getSecondaryProdByPrimaryProdResponse, UnmarshallerContext _ctx) {
		
		getSecondaryProdByPrimaryProdResponse.setRequestId(_ctx.stringValue("GetSecondaryProdByPrimaryProdResponse.RequestId"));
		getSecondaryProdByPrimaryProdResponse.set_Class(_ctx.stringValue("GetSecondaryProdByPrimaryProdResponse.Class"));
		getSecondaryProdByPrimaryProdResponse.setErrorMessage(_ctx.stringValue("GetSecondaryProdByPrimaryProdResponse.ErrorMessage"));
		getSecondaryProdByPrimaryProdResponse.setSuccess(_ctx.booleanValue("GetSecondaryProdByPrimaryProdResponse.Success"));
		getSecondaryProdByPrimaryProdResponse.setResultCode(_ctx.stringValue("GetSecondaryProdByPrimaryProdResponse.ResultCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSecondaryProdByPrimaryProdResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAoneId(_ctx.stringValue("GetSecondaryProdByPrimaryProdResponse.Result["+ i +"].AoneId"));
			resultItem.setAoneName(_ctx.stringValue("GetSecondaryProdByPrimaryProdResponse.Result["+ i +"].AoneName"));
			resultItem.set_Class(_ctx.stringValue("GetSecondaryProdByPrimaryProdResponse.Result["+ i +"].Class"));
			resultItem.setProductClass(_ctx.stringValue("GetSecondaryProdByPrimaryProdResponse.Result["+ i +"].ProductClass"));
			resultItem.setProductClassCN(_ctx.stringValue("GetSecondaryProdByPrimaryProdResponse.Result["+ i +"].ProductClassCN"));
			resultItem.setProductCode(_ctx.stringValue("GetSecondaryProdByPrimaryProdResponse.Result["+ i +"].ProductCode"));
			resultItem.setProductEnName(_ctx.stringValue("GetSecondaryProdByPrimaryProdResponse.Result["+ i +"].ProductEnName"));
			resultItem.setProductLineCN(_ctx.stringValue("GetSecondaryProdByPrimaryProdResponse.Result["+ i +"].ProductLineCN"));
			resultItem.setProductLineEN(_ctx.stringValue("GetSecondaryProdByPrimaryProdResponse.Result["+ i +"].ProductLineEN"));
			resultItem.setProductName(_ctx.stringValue("GetSecondaryProdByPrimaryProdResponse.Result["+ i +"].ProductName"));

			result.add(resultItem);
		}
		getSecondaryProdByPrimaryProdResponse.setResult(result);
	 
	 	return getSecondaryProdByPrimaryProdResponse;
	}
}