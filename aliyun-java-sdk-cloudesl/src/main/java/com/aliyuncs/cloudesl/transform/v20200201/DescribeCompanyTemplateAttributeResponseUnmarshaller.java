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

import com.aliyuncs.cloudesl.model.v20200201.DescribeCompanyTemplateAttributeResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeCompanyTemplateAttributeResponse.SelectItemInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCompanyTemplateAttributeResponseUnmarshaller {

	public static DescribeCompanyTemplateAttributeResponse unmarshall(DescribeCompanyTemplateAttributeResponse describeCompanyTemplateAttributeResponse, UnmarshallerContext _ctx) {
		
		describeCompanyTemplateAttributeResponse.setRequestId(_ctx.stringValue("DescribeCompanyTemplateAttributeResponse.RequestId"));
		describeCompanyTemplateAttributeResponse.setErrorMessage(_ctx.stringValue("DescribeCompanyTemplateAttributeResponse.ErrorMessage"));
		describeCompanyTemplateAttributeResponse.setSuccess(_ctx.booleanValue("DescribeCompanyTemplateAttributeResponse.Success"));
		describeCompanyTemplateAttributeResponse.setErrorCode(_ctx.stringValue("DescribeCompanyTemplateAttributeResponse.ErrorCode"));
		describeCompanyTemplateAttributeResponse.setCode(_ctx.stringValue("DescribeCompanyTemplateAttributeResponse.Code"));
		describeCompanyTemplateAttributeResponse.setMessage(_ctx.stringValue("DescribeCompanyTemplateAttributeResponse.Message"));
		describeCompanyTemplateAttributeResponse.setDynamicMessage(_ctx.stringValue("DescribeCompanyTemplateAttributeResponse.DynamicMessage"));
		describeCompanyTemplateAttributeResponse.setDynamicCode(_ctx.stringValue("DescribeCompanyTemplateAttributeResponse.DynamicCode"));

		List<SelectItemInfo> categoryField = new ArrayList<SelectItemInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCompanyTemplateAttributeResponse.CategoryField.Length"); i++) {
			SelectItemInfo selectItemInfo = new SelectItemInfo();
			selectItemInfo.setLabel(_ctx.stringValue("DescribeCompanyTemplateAttributeResponse.CategoryField["+ i +"].Label"));
			selectItemInfo.setValue(_ctx.stringValue("DescribeCompanyTemplateAttributeResponse.CategoryField["+ i +"].Value"));

			categoryField.add(selectItemInfo);
		}
		describeCompanyTemplateAttributeResponse.setCategoryField(categoryField);

		List<SelectItemInfo> fontType = new ArrayList<SelectItemInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCompanyTemplateAttributeResponse.FontType.Length"); i++) {
			SelectItemInfo selectItemInfo1 = new SelectItemInfo();
			selectItemInfo1.setLabel(_ctx.stringValue("DescribeCompanyTemplateAttributeResponse.FontType["+ i +"].Label"));
			selectItemInfo1.setValue(_ctx.stringValue("DescribeCompanyTemplateAttributeResponse.FontType["+ i +"].Value"));

			fontType.add(selectItemInfo1);
		}
		describeCompanyTemplateAttributeResponse.setFontType(fontType);

		List<SelectItemInfo> deviceType = new ArrayList<SelectItemInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCompanyTemplateAttributeResponse.DeviceType.Length"); i++) {
			SelectItemInfo selectItemInfo2 = new SelectItemInfo();
			selectItemInfo2.setLabel(_ctx.stringValue("DescribeCompanyTemplateAttributeResponse.DeviceType["+ i +"].Label"));
			selectItemInfo2.setValue(_ctx.stringValue("DescribeCompanyTemplateAttributeResponse.DeviceType["+ i +"].Value"));

			deviceType.add(selectItemInfo2);
		}
		describeCompanyTemplateAttributeResponse.setDeviceType(deviceType);

		List<SelectItemInfo> templateType = new ArrayList<SelectItemInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCompanyTemplateAttributeResponse.TemplateType.Length"); i++) {
			SelectItemInfo selectItemInfo3 = new SelectItemInfo();
			selectItemInfo3.setLabel(_ctx.stringValue("DescribeCompanyTemplateAttributeResponse.TemplateType["+ i +"].Label"));
			selectItemInfo3.setValue(_ctx.stringValue("DescribeCompanyTemplateAttributeResponse.TemplateType["+ i +"].Value"));

			templateType.add(selectItemInfo3);
		}
		describeCompanyTemplateAttributeResponse.setTemplateType(templateType);

		List<SelectItemInfo> sizeType = new ArrayList<SelectItemInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCompanyTemplateAttributeResponse.SizeType.Length"); i++) {
			SelectItemInfo selectItemInfo4 = new SelectItemInfo();
			selectItemInfo4.setLabel(_ctx.stringValue("DescribeCompanyTemplateAttributeResponse.SizeType["+ i +"].Label"));
			selectItemInfo4.setValue(_ctx.stringValue("DescribeCompanyTemplateAttributeResponse.SizeType["+ i +"].Value"));

			sizeType.add(selectItemInfo4);
		}
		describeCompanyTemplateAttributeResponse.setSizeType(sizeType);
	 
	 	return describeCompanyTemplateAttributeResponse;
	}
}