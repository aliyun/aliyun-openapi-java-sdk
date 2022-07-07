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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeImagesResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeImagesResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImagesResponseUnmarshaller {

	public static DescribeImagesResponse unmarshall(DescribeImagesResponse describeImagesResponse, UnmarshallerContext _ctx) {
		
		describeImagesResponse.setRequestId(_ctx.stringValue("DescribeImagesResponse.RequestId"));
		describeImagesResponse.setNextToken(_ctx.stringValue("DescribeImagesResponse.NextToken"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImagesResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setCreationTime(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].CreationTime"));
			image.setStatus(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Status"));
			image.setProgress(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Progress"));
			image.setDataDiskSize(_ctx.integerValue("DescribeImagesResponse.Images["+ i +"].DataDiskSize"));
			image.setImageType(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageType"));
			image.setDescription(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Description"));
			image.setSize(_ctx.integerValue("DescribeImagesResponse.Images["+ i +"].Size"));
			image.setOsType(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].OsType"));
			image.setProtocolType(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ProtocolType"));
			image.setName(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Name"));
			image.setImageId(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageId"));
			image.setGpuCategory(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].GpuCategory"));
			image.setGpuDriverVersion(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].GpuDriverVersion"));
			image.setAppVersion(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].AppVersion"));
			image.setVolumeEncryptionEnabled(_ctx.booleanValue("DescribeImagesResponse.Images["+ i +"].VolumeEncryptionEnabled"));
			image.setVolumeEncryptionKey(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].VolumeEncryptionKey"));
			image.setSharedCount(_ctx.integerValue("DescribeImagesResponse.Images["+ i +"].SharedCount"));
			image.setSessionType(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].SessionType"));

			List<String> supportedLanguages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagesResponse.Images["+ i +"].SupportedLanguages.Length"); j++) {
				supportedLanguages.add(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].SupportedLanguages["+ j +"]"));
			}
			image.setSupportedLanguages(supportedLanguages);

			images.add(image);
		}
		describeImagesResponse.setImages(images);
	 
	 	return describeImagesResponse;
	}
}