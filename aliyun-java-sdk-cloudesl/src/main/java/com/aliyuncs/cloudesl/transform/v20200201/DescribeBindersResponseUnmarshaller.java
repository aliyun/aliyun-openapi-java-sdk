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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.DescribeBindersResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeBindersResponse.EslItemBindInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBindersResponseUnmarshaller {

	public static DescribeBindersResponse unmarshall(DescribeBindersResponse describeBindersResponse, UnmarshallerContext _ctx) {
		
		describeBindersResponse.setRequestId(_ctx.stringValue("DescribeBindersResponse.RequestId"));
		describeBindersResponse.setErrorMessage(_ctx.stringValue("DescribeBindersResponse.ErrorMessage"));
		describeBindersResponse.setErrorCode(_ctx.stringValue("DescribeBindersResponse.ErrorCode"));
		describeBindersResponse.setTotalCount(_ctx.integerValue("DescribeBindersResponse.TotalCount"));
		describeBindersResponse.setMessage(_ctx.stringValue("DescribeBindersResponse.Message"));
		describeBindersResponse.setPageSize(_ctx.integerValue("DescribeBindersResponse.PageSize"));
		describeBindersResponse.setDynamicCode(_ctx.stringValue("DescribeBindersResponse.DynamicCode"));
		describeBindersResponse.setCode(_ctx.stringValue("DescribeBindersResponse.Code"));
		describeBindersResponse.setDynamicMessage(_ctx.stringValue("DescribeBindersResponse.DynamicMessage"));
		describeBindersResponse.setPageNumber(_ctx.integerValue("DescribeBindersResponse.PageNumber"));
		describeBindersResponse.setSuccess(_ctx.booleanValue("DescribeBindersResponse.Success"));

		List<EslItemBindInfo> eslItemBindInfos = new ArrayList<EslItemBindInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBindersResponse.EslItemBindInfos.Length"); i++) {
			EslItemBindInfo eslItemBindInfo = new EslItemBindInfo();
			eslItemBindInfo.setPromotionText(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].PromotionText"));
			eslItemBindInfo.setBindId(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].BindId"));
			eslItemBindInfo.setStoreId(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].StoreId"));
			eslItemBindInfo.setTemplateId(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].TemplateId"));
			eslItemBindInfo.setEslPic(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].EslPic"));
			eslItemBindInfo.setEslStatus(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].EslStatus"));
			eslItemBindInfo.setItemTitle(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].ItemTitle"));
			eslItemBindInfo.setOriginalPrice(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].OriginalPrice"));
			eslItemBindInfo.setTemplateSceneId(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].TemplateSceneId"));
			eslItemBindInfo.setGmtModified(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].GmtModified"));
			eslItemBindInfo.setActionPrice(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].ActionPrice"));
			eslItemBindInfo.setPriceUnit(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].PriceUnit"));
			eslItemBindInfo.setEslConnectAp(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].EslConnectAp"));
			eslItemBindInfo.setSkuId(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].SkuId"));
			eslItemBindInfo.setEslBarCode(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].EslBarCode"));
			eslItemBindInfo.setItemShortTitle(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].ItemShortTitle"));
			eslItemBindInfo.setBePromotion(_ctx.booleanValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].BePromotion"));
			eslItemBindInfo.setEslModel(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].EslModel"));
			eslItemBindInfo.setItemBarCode(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].ItemBarCode"));
			eslItemBindInfo.setItemId(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].ItemId"));
			eslItemBindInfo.setPromotionStart(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].PromotionStart"));
			eslItemBindInfo.setPromotionEnd(_ctx.stringValue("DescribeBindersResponse.EslItemBindInfos["+ i +"].PromotionEnd"));

			eslItemBindInfos.add(eslItemBindInfo);
		}
		describeBindersResponse.setEslItemBindInfos(eslItemBindInfos);
	 
	 	return describeBindersResponse;
	}
}