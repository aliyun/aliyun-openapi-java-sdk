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

package com.aliyuncs.petadata.transform.v20160101;

import com.aliyuncs.petadata.model.v20160101.DescribeUserInfoResponse;
import com.aliyuncs.petadata.model.v20160101.DescribeUserInfoResponse.AlreadyHasResourceNum;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserInfoResponseUnmarshaller {

	public static DescribeUserInfoResponse unmarshall(DescribeUserInfoResponse describeUserInfoResponse, UnmarshallerContext context) {
		
		describeUserInfoResponse.setRequestId(context.stringValue("DescribeUserInfoResponse.RequestId"));
		describeUserInfoResponse.setIsAuthentication(context.booleanValue("DescribeUserInfoResponse.IsAuthentication"));
		describeUserInfoResponse.setIsFinance(context.booleanValue("DescribeUserInfoResponse.IsFinance"));
		describeUserInfoResponse.setBalanceAmount(context.longValue("DescribeUserInfoResponse.BalanceAmount"));

		AlreadyHasResourceNum alreadyHasResourceNum = new AlreadyHasResourceNum();
		alreadyHasResourceNum.setEcsBought(context.longValue("DescribeUserInfoResponse.AlreadyHasResourceNum.EcsBought"));
		alreadyHasResourceNum.setPetaDataBought(context.longValue("DescribeUserInfoResponse.AlreadyHasResourceNum.PetaDataBought"));
		describeUserInfoResponse.setAlreadyHasResourceNum(alreadyHasResourceNum);
	 
	 	return describeUserInfoResponse;
	}
}