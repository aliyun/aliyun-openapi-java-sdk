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

package com.aliyuncs.alikafka.transform.v20190916;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alikafka.model.v20190916.GetMetaProductListResponse;
import com.aliyuncs.alikafka.model.v20190916.GetMetaProductListResponse.MetaData;
import com.aliyuncs.alikafka.model.v20190916.GetMetaProductListResponse.MetaData.SpecVO;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaProductListResponseUnmarshaller {

	public static GetMetaProductListResponse unmarshall(GetMetaProductListResponse getMetaProductListResponse, UnmarshallerContext _ctx) {
		
		getMetaProductListResponse.setRequestId(_ctx.stringValue("GetMetaProductListResponse.RequestId"));
		getMetaProductListResponse.setSuccess(_ctx.booleanValue("GetMetaProductListResponse.Success"));
		getMetaProductListResponse.setCode(_ctx.integerValue("GetMetaProductListResponse.Code"));
		getMetaProductListResponse.setMessage(_ctx.stringValue("GetMetaProductListResponse.Message"));

		MetaData metaData = new MetaData();
		metaData.setNames(_ctx.mapValue("GetMetaProductListResponse.MetaData.Names"));

		List<SpecVO> productsNormal = new ArrayList<SpecVO>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaProductListResponse.MetaData.ProductsNormal.Length"); i++) {
			SpecVO specVO = new SpecVO();
			specVO.setRegionId(_ctx.stringValue("GetMetaProductListResponse.MetaData.ProductsNormal["+ i +"].RegionId"));
			specVO.setSpecType(_ctx.stringValue("GetMetaProductListResponse.MetaData.ProductsNormal["+ i +"].SpecType"));
			specVO.setIoMax(_ctx.longValue("GetMetaProductListResponse.MetaData.ProductsNormal["+ i +"].IoMax"));
			specVO.setDiskType(_ctx.stringValue("GetMetaProductListResponse.MetaData.ProductsNormal["+ i +"].DiskType"));
			specVO.setDiskSize(_ctx.stringValue("GetMetaProductListResponse.MetaData.ProductsNormal["+ i +"].DiskSize"));
			specVO.setTopicQuota(_ctx.stringValue("GetMetaProductListResponse.MetaData.ProductsNormal["+ i +"].TopicQuota"));
			specVO.setDeployType(_ctx.stringValue("GetMetaProductListResponse.MetaData.ProductsNormal["+ i +"].DeployType"));

			productsNormal.add(specVO);
		}
		metaData.setProductsNormal(productsNormal);

		List<SpecVO> productsProfessional = new ArrayList<SpecVO>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaProductListResponse.MetaData.ProductsProfessional.Length"); i++) {
			SpecVO specVO_ = new SpecVO();
			specVO_.setRegionId(_ctx.stringValue("GetMetaProductListResponse.MetaData.ProductsProfessional["+ i +"].RegionId"));
			specVO_.setSpecType(_ctx.stringValue("GetMetaProductListResponse.MetaData.ProductsProfessional["+ i +"].SpecType"));
			specVO_.setIoMax(_ctx.longValue("GetMetaProductListResponse.MetaData.ProductsProfessional["+ i +"].IoMax"));
			specVO_.setDiskType(_ctx.stringValue("GetMetaProductListResponse.MetaData.ProductsProfessional["+ i +"].DiskType"));
			specVO_.setDiskSize(_ctx.stringValue("GetMetaProductListResponse.MetaData.ProductsProfessional["+ i +"].DiskSize"));
			specVO_.setTopicQuota(_ctx.stringValue("GetMetaProductListResponse.MetaData.ProductsProfessional["+ i +"].TopicQuota"));
			specVO_.setDeployType(_ctx.stringValue("GetMetaProductListResponse.MetaData.ProductsProfessional["+ i +"].DeployType"));

			productsProfessional.add(specVO_);
		}
		metaData.setProductsProfessional(productsProfessional);
		getMetaProductListResponse.setMetaData(metaData);
	 
	 	return getMetaProductListResponse;
	}
}