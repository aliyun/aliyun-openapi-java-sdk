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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.AddressesItem;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.AudioCoversItem;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.AudioCoversItem.CroppingSuggestionsItem6;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.AudioCoversItem.CroppingSuggestionsItem6.Boundary7;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.AudioCoversItem.ImageScore3;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.AudioCoversItem.OCRContentsItem8;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.AudioCoversItem.OCRContentsItem8.Boundary9;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.AudioStreamsItem;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.CroppingSuggestionsItem;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.CroppingSuggestionsItem.Boundary1;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.FiguresItem;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.FiguresItem.Boundary;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.FiguresItem.HeadPose;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.ImageScore;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.LabelsItem;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.OCRContentsItem;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.OCRContentsItem.Boundary2;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.SubtitlesItem;
import com.aliyuncs.imm.model.v20200930.SemanticQueryResponse.FilesItem.VideoStreamsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SemanticQueryResponseUnmarshaller {

	public static SemanticQueryResponse unmarshall(SemanticQueryResponse semanticQueryResponse, UnmarshallerContext _ctx) {
		
		semanticQueryResponse.setRequestId(_ctx.stringValue("SemanticQueryResponse.RequestId"));
		semanticQueryResponse.setNextToken(_ctx.stringValue("SemanticQueryResponse.NextToken"));

		List<FilesItem> files = new ArrayList<FilesItem>();
		for (int i = 0; i < _ctx.lengthValue("SemanticQueryResponse.Files.Length"); i++) {
			FilesItem filesItem = new FilesItem();
			filesItem.setOwnerId(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].OwnerId"));
			filesItem.setProjectName(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].ProjectName"));
			filesItem.setDatasetName(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].DatasetName"));
			filesItem.setObjectType(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].ObjectType"));
			filesItem.setObjectId(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].ObjectId"));
			filesItem.setUpdateTime(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].UpdateTime"));
			filesItem.setCreateTime(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].CreateTime"));
			filesItem.setURI(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].URI"));
			filesItem.setOSSURI(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].OSSURI"));
			filesItem.setFilename(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Filename"));
			filesItem.setMediaType(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].MediaType"));
			filesItem.setContentType(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].ContentType"));
			filesItem.setSize(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].Size"));
			filesItem.setFileHash(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].FileHash"));
			filesItem.setFileModifiedTime(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].FileModifiedTime"));
			filesItem.setFileCreateTime(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].FileCreateTime"));
			filesItem.setFileAccessTime(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].FileAccessTime"));
			filesItem.setProduceTime(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].ProduceTime"));
			filesItem.setLatLong(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].LatLong"));
			filesItem.setTimezone(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Timezone"));
			filesItem.setTravelClusterId(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].TravelClusterId"));
			filesItem.setOrientation(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].Orientation"));
			filesItem.setFigureCount(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].FigureCount"));
			filesItem.setTitle(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Title"));
			filesItem.setImageWidth(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].ImageWidth"));
			filesItem.setImageHeight(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].ImageHeight"));
			filesItem.setEXIF(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].EXIF"));
			filesItem.setVideoWidth(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].VideoWidth"));
			filesItem.setVideoHeight(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].VideoHeight"));
			filesItem.setArtist(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Artist"));
			filesItem.setAlbumArtist(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].AlbumArtist"));
			filesItem.setComposer(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Composer"));
			filesItem.setPerformer(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Performer"));
			filesItem.setLanguage(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Language"));
			filesItem.setAlbum(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Album"));
			filesItem.setPageCount(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].PageCount"));
			filesItem.setDocumentText(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].DocumentText"));
			filesItem.setETag(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].ETag"));
			filesItem.setCacheControl(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].CacheControl"));
			filesItem.setContentDisposition(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].ContentDisposition"));
			filesItem.setContentEncoding(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].ContentEncoding"));
			filesItem.setContentLanguage(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].ContentLanguage"));
			filesItem.setAccessControlAllowOrigin(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].AccessControlAllowOrigin"));
			filesItem.setAccessControlRequestMethod(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].AccessControlRequestMethod"));
			filesItem.setServerSideEncryptionCustomerAlgorithm(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].ServerSideEncryptionCustomerAlgorithm"));
			filesItem.setServerSideEncryption(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].ServerSideEncryption"));
			filesItem.setServerSideDataEncryption(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].ServerSideDataEncryption"));
			filesItem.setServerSideEncryptionKeyId(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].ServerSideEncryptionKeyId"));
			filesItem.setOSSStorageClass(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].OSSStorageClass"));
			filesItem.setOSSCRC64(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].OSSCRC64"));
			filesItem.setObjectACL(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].ObjectACL"));
			filesItem.setContentMd5(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].ContentMd5"));
			filesItem.setOSSUserMeta(_ctx.mapValue("SemanticQueryResponse.Files["+ i +"].OSSUserMeta"));
			filesItem.setOSSTaggingCount(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].OSSTaggingCount"));
			filesItem.setOSSTagging(_ctx.mapValue("SemanticQueryResponse.Files["+ i +"].OSSTagging"));
			filesItem.setOSSExpiration(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].OSSExpiration"));
			filesItem.setOSSVersionId(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].OSSVersionId"));
			filesItem.setOSSDeleteMarker(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].OSSDeleteMarker"));
			filesItem.setOSSObjectType(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].OSSObjectType"));
			filesItem.setCustomId(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].CustomId"));
			filesItem.setCustomLabels(_ctx.mapValue("SemanticQueryResponse.Files["+ i +"].CustomLabels"));
			filesItem.setStreamCount(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].StreamCount"));
			filesItem.setProgramCount(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].ProgramCount"));
			filesItem.setFormatName(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].FormatName"));
			filesItem.setFormatLongName(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].FormatLongName"));
			filesItem.setStartTime(_ctx.doubleValue("SemanticQueryResponse.Files["+ i +"].StartTime"));
			filesItem.setBitrate(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].Bitrate"));
			filesItem.setDuration(_ctx.doubleValue("SemanticQueryResponse.Files["+ i +"].Duration"));

			ImageScore imageScore = new ImageScore();
			imageScore.setOverallQualityScore(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].ImageScore.OverallQualityScore"));
			filesItem.setImageScore(imageScore);

			List<AddressesItem> addresses = new ArrayList<AddressesItem>();
			for (int j = 0; j < _ctx.lengthValue("SemanticQueryResponse.Files["+ i +"].Addresses.Length"); j++) {
				AddressesItem addressesItem = new AddressesItem();
				addressesItem.setLanguage(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Addresses["+ j +"].Language"));
				addressesItem.setAddressLine(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Addresses["+ j +"].AddressLine"));
				addressesItem.setCountry(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Addresses["+ j +"].Country"));
				addressesItem.setProvince(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Addresses["+ j +"].Province"));
				addressesItem.setCity(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Addresses["+ j +"].City"));
				addressesItem.setDistrict(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Addresses["+ j +"].District"));
				addressesItem.setTownship(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Addresses["+ j +"].Township"));

				addresses.add(addressesItem);
			}
			filesItem.setAddresses(addresses);

			List<FiguresItem> figures = new ArrayList<FiguresItem>();
			for (int j = 0; j < _ctx.lengthValue("SemanticQueryResponse.Files["+ i +"].Figures.Length"); j++) {
				FiguresItem figuresItem = new FiguresItem();
				figuresItem.setFigureId(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].FigureId"));
				figuresItem.setFigureConfidence(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].FigureConfidence"));
				figuresItem.setFigureClusterId(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].FigureClusterId"));
				figuresItem.setFigureClusterConfidence(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].FigureClusterConfidence"));
				figuresItem.setFigureType(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].FigureType"));
				figuresItem.setAge(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].Age"));
				figuresItem.setAgeSD(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].AgeSD"));
				figuresItem.setGender(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].Gender"));
				figuresItem.setGenderConfidence(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].GenderConfidence"));
				figuresItem.setEmotion(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].Emotion"));
				figuresItem.setEmotionConfidence(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].EmotionConfidence"));
				figuresItem.setFaceQuality(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].FaceQuality"));
				figuresItem.setMouth(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].Mouth"));
				figuresItem.setMouthConfidence(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].MouthConfidence"));
				figuresItem.setBeard(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].Beard"));
				figuresItem.setBeardConfidence(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].BeardConfidence"));
				figuresItem.setHat(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].Hat"));
				figuresItem.setHatConfidence(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].HatConfidence"));
				figuresItem.setMask(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].Mask"));
				figuresItem.setMaskConfidence(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].MaskConfidence"));
				figuresItem.setGlasses(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].Glasses"));
				figuresItem.setGlassesConfidence(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].GlassesConfidence"));
				figuresItem.setSharpness(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].Sharpness"));
				figuresItem.setAttractive(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].Attractive"));

				Boundary boundary = new Boundary();
				boundary.setWidth(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].Boundary.Width"));
				boundary.setHeight(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].Boundary.Height"));
				boundary.setLeft(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].Boundary.Left"));
				boundary.setTop(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].Boundary.Top"));
				figuresItem.setBoundary(boundary);

				HeadPose headPose = new HeadPose();
				headPose.setPitch(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].HeadPose.Pitch"));
				headPose.setRoll(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].HeadPose.Roll"));
				headPose.setYaw(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Figures["+ j +"].HeadPose.Yaw"));
				figuresItem.setHeadPose(headPose);

				figures.add(figuresItem);
			}
			filesItem.setFigures(figures);

			List<LabelsItem> labels = new ArrayList<LabelsItem>();
			for (int j = 0; j < _ctx.lengthValue("SemanticQueryResponse.Files["+ i +"].Labels.Length"); j++) {
				LabelsItem labelsItem = new LabelsItem();
				labelsItem.setLanguage(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Labels["+ j +"].Language"));
				labelsItem.setLabelName(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Labels["+ j +"].LabelName"));
				labelsItem.setLabelLevel(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].Labels["+ j +"].LabelLevel"));
				labelsItem.setLabelConfidence(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Labels["+ j +"].LabelConfidence"));
				labelsItem.setParentLabelName(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Labels["+ j +"].ParentLabelName"));
				labelsItem.setCentricScore(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].Labels["+ j +"].CentricScore"));

				labels.add(labelsItem);
			}
			filesItem.setLabels(labels);

			List<CroppingSuggestionsItem> croppingSuggestions = new ArrayList<CroppingSuggestionsItem>();
			for (int j = 0; j < _ctx.lengthValue("SemanticQueryResponse.Files["+ i +"].CroppingSuggestions.Length"); j++) {
				CroppingSuggestionsItem croppingSuggestionsItem = new CroppingSuggestionsItem();
				croppingSuggestionsItem.setAspectRatio(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].CroppingSuggestions["+ j +"].AspectRatio"));
				croppingSuggestionsItem.setConfidence(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].CroppingSuggestions["+ j +"].Confidence"));

				Boundary1 boundary1 = new Boundary1();
				boundary1.setWidth(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].CroppingSuggestions["+ j +"].Boundary.Width"));
				boundary1.setHeight(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].CroppingSuggestions["+ j +"].Boundary.Height"));
				boundary1.setLeft(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].CroppingSuggestions["+ j +"].Boundary.Left"));
				boundary1.setTop(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].CroppingSuggestions["+ j +"].Boundary.Top"));
				croppingSuggestionsItem.setBoundary1(boundary1);

				croppingSuggestions.add(croppingSuggestionsItem);
			}
			filesItem.setCroppingSuggestions(croppingSuggestions);

			List<OCRContentsItem> oCRContents = new ArrayList<OCRContentsItem>();
			for (int j = 0; j < _ctx.lengthValue("SemanticQueryResponse.Files["+ i +"].OCRContents.Length"); j++) {
				OCRContentsItem oCRContentsItem = new OCRContentsItem();
				oCRContentsItem.setLanguage(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].OCRContents["+ j +"].Language"));
				oCRContentsItem.setContents(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].OCRContents["+ j +"].Contents"));
				oCRContentsItem.setConfidence(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].OCRContents["+ j +"].Confidence"));

				Boundary2 boundary2 = new Boundary2();
				boundary2.setWidth(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].OCRContents["+ j +"].Boundary.Width"));
				boundary2.setHeight(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].OCRContents["+ j +"].Boundary.Height"));
				boundary2.setLeft(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].OCRContents["+ j +"].Boundary.Left"));
				boundary2.setTop(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].OCRContents["+ j +"].Boundary.Top"));
				oCRContentsItem.setBoundary2(boundary2);

				oCRContents.add(oCRContentsItem);
			}
			filesItem.setOCRContents(oCRContents);

			List<VideoStreamsItem> videoStreams = new ArrayList<VideoStreamsItem>();
			for (int j = 0; j < _ctx.lengthValue("SemanticQueryResponse.Files["+ i +"].VideoStreams.Length"); j++) {
				VideoStreamsItem videoStreamsItem = new VideoStreamsItem();
				videoStreamsItem.setIndex(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].Index"));
				videoStreamsItem.setLanguage(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].Language"));
				videoStreamsItem.setCodecName(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].CodecName"));
				videoStreamsItem.setCodecLongName(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].CodecLongName"));
				videoStreamsItem.setProfile(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].Profile"));
				videoStreamsItem.setCodecTimeBase(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].CodecTimeBase"));
				videoStreamsItem.setCodecTagString(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].CodecTagString"));
				videoStreamsItem.setCodecTag(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].CodecTag"));
				videoStreamsItem.setWidth(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].Width"));
				videoStreamsItem.setHeight(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].Height"));
				videoStreamsItem.setHasBFrames(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].HasBFrames"));
				videoStreamsItem.setSampleAspectRatio(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].SampleAspectRatio"));
				videoStreamsItem.setDisplayAspectRatio(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].DisplayAspectRatio"));
				videoStreamsItem.setPixelFormat(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].PixelFormat"));
				videoStreamsItem.setLevel(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].Level"));
				videoStreamsItem.setFrameRate(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].FrameRate"));
				videoStreamsItem.setAverageFrameRate(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].AverageFrameRate"));
				videoStreamsItem.setTimeBase(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].TimeBase"));
				videoStreamsItem.setStartTime(_ctx.doubleValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].StartTime"));
				videoStreamsItem.setDuration(_ctx.doubleValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].Duration"));
				videoStreamsItem.setBitrate(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].Bitrate"));
				videoStreamsItem.setFrameCount(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].FrameCount"));
				videoStreamsItem.setRotate(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].Rotate"));
				videoStreamsItem.setBitDepth(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].BitDepth"));
				videoStreamsItem.setColorSpace(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].ColorSpace"));
				videoStreamsItem.setColorRange(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].ColorRange"));
				videoStreamsItem.setColorTransfer(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].ColorTransfer"));
				videoStreamsItem.setColorPrimaries(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].VideoStreams["+ j +"].ColorPrimaries"));

				videoStreams.add(videoStreamsItem);
			}
			filesItem.setVideoStreams(videoStreams);

			List<SubtitlesItem> subtitles = new ArrayList<SubtitlesItem>();
			for (int j = 0; j < _ctx.lengthValue("SemanticQueryResponse.Files["+ i +"].Subtitles.Length"); j++) {
				SubtitlesItem subtitlesItem = new SubtitlesItem();
				subtitlesItem.setIndex(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].Subtitles["+ j +"].Index"));
				subtitlesItem.setLanguage(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Subtitles["+ j +"].Language"));
				subtitlesItem.setCodecName(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Subtitles["+ j +"].CodecName"));
				subtitlesItem.setCodecLongName(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Subtitles["+ j +"].CodecLongName"));
				subtitlesItem.setCodecTagString(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Subtitles["+ j +"].CodecTagString"));
				subtitlesItem.setCodecTag(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Subtitles["+ j +"].CodecTag"));
				subtitlesItem.setStartTime(_ctx.doubleValue("SemanticQueryResponse.Files["+ i +"].Subtitles["+ j +"].StartTime"));
				subtitlesItem.setDuration(_ctx.doubleValue("SemanticQueryResponse.Files["+ i +"].Subtitles["+ j +"].Duration"));
				subtitlesItem.setBitrate(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].Subtitles["+ j +"].Bitrate"));
				subtitlesItem.setContent(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].Subtitles["+ j +"].Content"));
				subtitlesItem.setWidth(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].Subtitles["+ j +"].Width"));
				subtitlesItem.setHeight(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].Subtitles["+ j +"].Height"));

				subtitles.add(subtitlesItem);
			}
			filesItem.setSubtitles(subtitles);

			List<AudioStreamsItem> audioStreams = new ArrayList<AudioStreamsItem>();
			for (int j = 0; j < _ctx.lengthValue("SemanticQueryResponse.Files["+ i +"].AudioStreams.Length"); j++) {
				AudioStreamsItem audioStreamsItem = new AudioStreamsItem();
				audioStreamsItem.setIndex(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].AudioStreams["+ j +"].Index"));
				audioStreamsItem.setLanguage(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].AudioStreams["+ j +"].Language"));
				audioStreamsItem.setCodecName(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].AudioStreams["+ j +"].CodecName"));
				audioStreamsItem.setCodecLongName(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].AudioStreams["+ j +"].CodecLongName"));
				audioStreamsItem.setCodecTimeBase(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].AudioStreams["+ j +"].CodecTimeBase"));
				audioStreamsItem.setCodecTagString(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].AudioStreams["+ j +"].CodecTagString"));
				audioStreamsItem.setCodecTag(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].AudioStreams["+ j +"].CodecTag"));
				audioStreamsItem.setTimeBase(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].AudioStreams["+ j +"].TimeBase"));
				audioStreamsItem.setStartTime(_ctx.doubleValue("SemanticQueryResponse.Files["+ i +"].AudioStreams["+ j +"].StartTime"));
				audioStreamsItem.setDuration(_ctx.doubleValue("SemanticQueryResponse.Files["+ i +"].AudioStreams["+ j +"].Duration"));
				audioStreamsItem.setBitrate(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].AudioStreams["+ j +"].Bitrate"));
				audioStreamsItem.setFrameCount(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].AudioStreams["+ j +"].FrameCount"));
				audioStreamsItem.setLyric(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].AudioStreams["+ j +"].Lyric"));
				audioStreamsItem.setSampleFormat(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].AudioStreams["+ j +"].SampleFormat"));
				audioStreamsItem.setSampleRate(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].AudioStreams["+ j +"].SampleRate"));
				audioStreamsItem.setChannels(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].AudioStreams["+ j +"].Channels"));
				audioStreamsItem.setChannelLayout(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].AudioStreams["+ j +"].ChannelLayout"));

				audioStreams.add(audioStreamsItem);
			}
			filesItem.setAudioStreams(audioStreams);

			List<AudioCoversItem> audioCovers = new ArrayList<AudioCoversItem>();
			for (int j = 0; j < _ctx.lengthValue("SemanticQueryResponse.Files["+ i +"].AudioCovers.Length"); j++) {
				AudioCoversItem audioCoversItem = new AudioCoversItem();
				audioCoversItem.setImageWidth(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].ImageWidth"));
				audioCoversItem.setImageHeight(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].ImageHeight"));
				audioCoversItem.setEXIF(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].EXIF"));

				ImageScore3 imageScore3 = new ImageScore3();
				imageScore3.setOverallQualityScore(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].ImageScore.OverallQualityScore"));
				audioCoversItem.setImageScore3(imageScore3);

				List<CroppingSuggestionsItem6> croppingSuggestions4 = new ArrayList<CroppingSuggestionsItem6>();
				for (int k = 0; k < _ctx.lengthValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions.Length"); k++) {
					CroppingSuggestionsItem6 croppingSuggestionsItem6 = new CroppingSuggestionsItem6();
					croppingSuggestionsItem6.setAspectRatio(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].AspectRatio"));
					croppingSuggestionsItem6.setConfidence(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Confidence"));

					Boundary7 boundary7 = new Boundary7();
					boundary7.setWidth(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Width"));
					boundary7.setHeight(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Height"));
					boundary7.setLeft(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Left"));
					boundary7.setTop(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Top"));
					croppingSuggestionsItem6.setBoundary7(boundary7);

					croppingSuggestions4.add(croppingSuggestionsItem6);
				}
				audioCoversItem.setCroppingSuggestions4(croppingSuggestions4);

				List<OCRContentsItem8> oCRContents5 = new ArrayList<OCRContentsItem8>();
				for (int k = 0; k < _ctx.lengthValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].OCRContents.Length"); k++) {
					OCRContentsItem8 oCRContentsItem8 = new OCRContentsItem8();
					oCRContentsItem8.setLanguage(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Language"));
					oCRContentsItem8.setContents(_ctx.stringValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Contents"));
					oCRContentsItem8.setConfidence(_ctx.floatValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Confidence"));

					Boundary9 boundary9 = new Boundary9();
					boundary9.setWidth(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Width"));
					boundary9.setHeight(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Height"));
					boundary9.setLeft(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Left"));
					boundary9.setTop(_ctx.longValue("SemanticQueryResponse.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Top"));
					oCRContentsItem8.setBoundary9(boundary9);

					oCRContents5.add(oCRContentsItem8);
				}
				audioCoversItem.setOCRContents5(oCRContents5);

				audioCovers.add(audioCoversItem);
			}
			filesItem.setAudioCovers(audioCovers);

			files.add(filesItem);
		}
		semanticQueryResponse.setFiles(files);
	 
	 	return semanticQueryResponse;
	}
}