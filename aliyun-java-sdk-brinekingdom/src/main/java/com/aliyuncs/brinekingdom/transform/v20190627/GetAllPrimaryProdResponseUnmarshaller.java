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

import com.aliyuncs.brinekingdom.model.v20190627.GetAllPrimaryProdResponse;
import com.aliyuncs.brinekingdom.model.v20190627.GetAllPrimaryProdResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAllPrimaryProdResponseUnmarshaller {

	public static GetAllPrimaryProdResponse unmarshall(GetAllPrimaryProdResponse getAllPrimaryProdResponse, UnmarshallerContext _ctx) {
		
		getAllPrimaryProdResponse.setRequestId(_ctx.stringValue("GetAllPrimaryProdResponse.RequestId"));
		getAllPrimaryProdResponse.set_Class(_ctx.stringValue("GetAllPrimaryProdResponse.Class"));
		getAllPrimaryProdResponse.setErrorMessage(_ctx.stringValue("GetAllPrimaryProdResponse.ErrorMessage"));
		getAllPrimaryProdResponse.setSuccess(_ctx.booleanValue("GetAllPrimaryProdResponse.Success"));
		getAllPrimaryProdResponse.setResultCode(_ctx.stringValue("GetAllPrimaryProdResponse.ResultCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAllPrimaryProdResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAoneId(_ctx.stringValue("GetAllPrimaryProdResponse.Result["+ i +"].AoneId"));
			resultItem.setAoneName(_ctx.stringValue("GetAllPrimaryProdResponse.Result["+ i +"].AoneName"));
			resultItem.set_Class(_ctx.stringValue("GetAllPrimaryProdResponse.Result["+ i +"].Class"));
			resultItem.setProductClass(_ctx.stringValue("GetAllPrimaryProdResponse.Result["+ i +"].ProductClass"));
			resultItem.setProductClassCN(_ctx.stringValue("GetAllPrimaryProdResponse.Result["+ i +"].ProductClassCN"));
			resultItem.setProductCode(_ctx.stringValue("GetAllPrimaryProdResponse.Result["+ i +"].ProductCode"));
			resultItem.setProductEnName(_ctx.stringValue("GetAllPrimaryProdResponse.Result["+ i +"].ProductEnName"));
			resultItem.setProductLineCN(_ctx.stringValue("GetAllPrimaryProdResponse.Result["+ i +"].ProductLineCN"));
			resultItem.setProductLineEN(_ctx.stringValue("GetAllPrimaryProdResponse.Result["+ i +"].ProductLineEN"));
			resultItem.setProductName(_ctx.stringValue("GetAllPrimaryProdResponse.Result["+ i +"].ProductName"));

			result.add(resultItem);
		}
		getAllPrimaryProdResponse.setResult(result);
	 
	 	return getAllPrimaryProdResponse;
	}
}