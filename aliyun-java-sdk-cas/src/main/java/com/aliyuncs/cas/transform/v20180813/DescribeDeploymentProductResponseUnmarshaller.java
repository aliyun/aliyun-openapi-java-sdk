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

package com.aliyuncs.cas.transform.v20180813;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cas.model.v20180813.DescribeDeploymentProductResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeploymentProductResponseUnmarshaller {

	public static DescribeDeploymentProductResponse unmarshall(DescribeDeploymentProductResponse describeDeploymentProductResponse, UnmarshallerContext context) {
		
		describeDeploymentProductResponse.setRequestId(context.stringValue("DescribeDeploymentProductResponse.RequestId"));

		List<String> productList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeDeploymentProductResponse.ProductList.Length"); i++) {
			productList.add(context.stringValue("DescribeDeploymentProductResponse.ProductList["+ i +"]"));
		}
		describeDeploymentProductResponse.setProductList(productList);
	 
	 	return describeDeploymentProductResponse;
	}
}