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

package com.aliyuncs.ivpd.transform.v20190625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ivpd.model.v20190625.ListPackageDesignModelTypesResponse;
import com.aliyuncs.ivpd.model.v20190625.ListPackageDesignModelTypesResponse.Data;
import com.aliyuncs.ivpd.model.v20190625.ListPackageDesignModelTypesResponse.Data.ModelType;
import com.aliyuncs.ivpd.model.v20190625.ListPackageDesignModelTypesResponse.Data.ModelType.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPackageDesignModelTypesResponseUnmarshaller {

	public static ListPackageDesignModelTypesResponse unmarshall(ListPackageDesignModelTypesResponse listPackageDesignModelTypesResponse, UnmarshallerContext _ctx) {
		
		listPackageDesignModelTypesResponse.setRequestId(_ctx.stringValue("ListPackageDesignModelTypesResponse.RequestId"));
		listPackageDesignModelTypesResponse.setCode(_ctx.stringValue("ListPackageDesignModelTypesResponse.Code"));
		listPackageDesignModelTypesResponse.setMessage(_ctx.stringValue("ListPackageDesignModelTypesResponse.Message"));

		Data data = new Data();

		List<ModelType> modelTypeList = new ArrayList<ModelType>();
		for (int i = 0; i < _ctx.lengthValue("ListPackageDesignModelTypesResponse.Data.ModelTypeList.Length"); i++) {
			ModelType modelType = new ModelType();
			modelType.setModelType(_ctx.stringValue("ListPackageDesignModelTypesResponse.Data.ModelTypeList["+ i +"].ModelType"));

			List<Element> elements = new ArrayList<Element>();
			for (int j = 0; j < _ctx.lengthValue("ListPackageDesignModelTypesResponse.Data.ModelTypeList["+ i +"].Elements.Length"); j++) {
				Element element = new Element();
				element.setSideName(_ctx.stringValue("ListPackageDesignModelTypesResponse.Data.ModelTypeList["+ i +"].Elements["+ j +"].SideName"));

				elements.add(element);
			}
			modelType.setElements(elements);

			modelTypeList.add(modelType);
		}
		data.setModelTypeList(modelTypeList);
		listPackageDesignModelTypesResponse.setData(data);
	 
	 	return listPackageDesignModelTypesResponse;
	}
}